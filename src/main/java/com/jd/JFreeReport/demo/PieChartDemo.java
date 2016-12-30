package com.jd.JFreeReport.demo;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.title.TextTitle;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class PieChartDemo {
    private static final long serialVersionUID = 2598557557724085474L;
    public static final Font font = new Font("宋体", Font.BOLD, 20);
    private static PieDataset createDataset() {
        DefaultPieDataset defaultpiedataset = new DefaultPieDataset();
        defaultpiedataset.setValue("One", new Double(43.2));
        defaultpiedataset.setValue("Two", new Double(10.0));
        defaultpiedataset.setValue("Three", new Double(27.5));
        defaultpiedataset.setValue("Four", new Double(17.5));
        defaultpiedataset.setValue("Five", new Double(11.0));
        defaultpiedataset.setValue("Six", new Double(19.4));
        return defaultpiedataset;
    }
    private static JFreeChart createPie2DChart(PieDataset piedataset){
        JFreeChart jfreechart = ChartFactory.createPieChart("普通饼图",piedataset, true, true, false);
        //得到标题
        TextTitle texttitle = jfreechart.getTitle();
        //标题
        texttitle.setFont(font);
        texttitle.setToolTipText("A title tooltip!");
        //得到绘图区
        PiePlot pieplot = (PiePlot) jfreechart.getPlot();
        //设置标签字体
        pieplot.setLabelFont(font);
        pieplot.setNoDataMessage("No data available");
        pieplot.setCircular(false);
        pieplot.setLabelGap(0.02);
        //提示条字体
        jfreechart.getLegend().setItemFont(font);

        return jfreechart;
    }

    public static JFreeChart createPie3DChart(PieDataset dataset){
        JFreeChart chart = ChartFactory.createPieChart3D("3D饼图", dataset, true, true, false);
        chart.getTitle().setFont(font);
        PiePlot3D piePlot3D = (PiePlot3D) chart.getPlot();
        piePlot3D.setStartAngle(180);
        piePlot3D.setDirection(Rotation.CLOCKWISE);
        piePlot3D.setForegroundAlpha(0.5F);
        piePlot3D.setNoDataMessage("No data to display");
        return chart;
    }
    public static void main(String[] args) {
        PieDataset dataset=createDataset();
        JFreeChart chart=createPie2DChart(dataset);
        try {
            ChartUtilities.saveChartAsJPEG(new File("E:\\javatest\\img\\Pie2DChart.jpg"), chart, 800, 400);
        } catch (IOException e) {
            System.out.println("生成图片出错");
            e.printStackTrace();
        }
        JFreeChart chart1=createPie3DChart(dataset);
        try {
            ChartUtilities.saveChartAsJPEG(new File("E:\\javatest\\img\\Pie3DChart.jpg"), chart1, 300, 300);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
