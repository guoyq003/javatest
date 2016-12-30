package com.jd.JFreeReport.demo;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import java.io.File;
import java.io.IOException;

public class PieChart {
    public static void main(String[] args) throws IOException {
        DefaultPieDataset dataset = new DefaultPieDataset( );
        dataset.setValue("IPhone 5s", new Double( 20 ) );
        dataset.setValue("SamSung Grand", new Double( 20 ) );
        dataset.setValue("MotoG", new Double( 10 ) );
        dataset.setValue("Nokia Lumia", new Double( 10 ) );
        dataset.setValue("xiaomi", new Double( 40 ) );
        JFreeChart chart = ChartFactory.createPieChart(
                "Mobile Sales", // chart title
                dataset, // data
                true, // include legend
                true,
                false);

        int width = 500; /* Width of the image */
        int height = 480; /* Height of the image */
        File pieChart = new File( "E:\\javatest\\img\\PieChart.jpg" );
        ChartUtilities.saveChartAsJPEG(pieChart,chart,width,height);
    }
}
