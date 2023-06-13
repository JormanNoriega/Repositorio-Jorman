/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.graphics;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class Graphics extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // crear conjunto de datos para el gráfico de tipo Pie Chart
        ObservableList <PieChart.Data> pieChartData = FXCollections.observableArrayList(
                new PieChart.Data("Alimentos", 45.2),
                new PieChart.Data("Transporte", 30.6),
                new PieChart.Data("Salidas", 15.8),
                new PieChart.Data("CreditCard", 8.4)
        );
        
        // crear el gráfico de tipo Pie Chart
        PieChart pieChart = new PieChart(pieChartData);
        
        // personalizar apariencia y estilos del gráfico 
        pieChart.setTitle("Egresos");
        
        // crear la escena y configurar el stage principal
        Scene scene = new Scene(pieChart, 400, 300);
        primaryStage.setTitle("Grafica Pie Chart");
        primaryStage.setScene(scene);
        
        primaryStage.show();
    }
}
