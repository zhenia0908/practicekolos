package com.zhenia.practicekolos.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Products {
ArrayList<Product> listOfProducts = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/zhenia/practicekolos/task2/productsList"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/zhenia/practicekolos/task2/productsList2"))
        ) {
            String line;
            br.readLine();
            bw.write(String.format("%-20s%-20s%n", "Категория", "Средняя цена"));
            while ((line = br.readLine()) != null) {
                String[] res = line.split("\\s+");
                Product product = new Product();
                product.setName(res[0]);
                product.setKategory(res[1]);
                double price = Double.parseDouble(res[2]);
                 product.setPrice(price);

                bw.write(String.format("%-20s%-20s%n", setKategory));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedReader br1 = new BufferedReader(new FileReader("src/main/java/com/zhenia/practicekolos/task2/productsList"));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter("src/main/java/com/zhenia/practicekolos/task2/productsList3"))) {
            String line;
            br1.readLine();
            bw1.write(String.format("%-20s%-20s%n", "Название", "Цена"));
            while ((line = br1.readLine()) != null) {
                String[] res = line.split("\\s+");
                String name = res[0];

                double price = Double.parseDouble(res[2]);


                bw1.write(String.format("%-20s%-20s%n", name, price));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
