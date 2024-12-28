/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesaka;

/**
 *
 * @author dell
 */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
import java.util.List;

public class ComplexityGraphPanel extends JPanel{
    public ComplexityGraphPanel(List<Long> iterativeTimes, List<Long> recursiveTimes, List<Integer> inputSizes) {
        XYSeries iterativeSeries = new XYSeries("Iterative");
        XYSeries recursiveSeries = new XYSeries("Recursive");

        for (int i = 0; i < inputSizes.size(); i++) {
            iterativeSeries.add(inputSizes.get(i), iterativeTimes.get(i));
            recursiveSeries.add(inputSizes.get(i), recursiveTimes.get(i));
        }

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(iterativeSeries);
        dataset.addSeries(recursiveSeries);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Algorithm Time Complexity",
                "Input Size",
                "Execution Time (ms)",
                dataset
        );

        ChartPanel chartPanel = new ChartPanel(chart);
        this.add(chartPanel);
    }
}
