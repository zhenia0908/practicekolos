package com.zhenia.practicekolos.task2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Products {

    public static ArrayList<Product> listOfProducts = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/com/zhenia/practicekolos/task2/productsList"))
        ) {

            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] res = line.split("\\s+");
                Product product = new Product();
                product.setName(res[0]);
                product.setKategory(res[1]);
                double price = Double.parseDouble(res[2]);
                product.setPrice(price);
                listOfProducts.add(product);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(listOfProducts.size());
        Products products = new Products();
        products.middlePrice();
        products.sorted();
    }

    public void middlePrice() throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/zhenia/practicekolos/task2/productsList3"))) {
            bw.write(String.format("%-20s%-20s%n", "Kategory", "Middle price"));
            int count = 0;
            double sum = 0;
            double middlePrice;
            HashSet<String> kategories = new HashSet<>();
            HashMap<String, Double> price = new HashMap<>();
            for (int i = 0; i < listOfProducts.size(); i++) {
                kategories.add(listOfProducts.get(i).getKategory());
            }
            for (String a : kategories) {
                for (int i = 0; i < listOfProducts.size(); i++) {
                    if (listOfProducts.get(i).getKategory().equals(a)) {
                        count++;
                        sum += listOfProducts.get(i).getPrice();
                    }
                }
                    middlePrice = sum / count;
                    price.put(a, middlePrice);
                    bw.write(String.format("%-20s%-20s%n", a, middlePrice));
                sum = 0;
                count = 0;
                middlePrice = 0;

                }

            }
         catch (Exception e) {
            e.printStackTrace();
        }
        //создать hashset
        //пройтись по твоей коллекции с прродуктами
        // добавить в твой сет строку категория, так как сет не допускает дубликатов - каждая категория встретиться один раз
        // овощи фрукты ягоды
        // циклом проходишься по сету
        // первый элемент - овощи, смотришь какие продукты из listOfProducts (здесь рассчитываешь среднее)
        // рассчитала - поместила в хэшмэп(ключ - категория, значение - средняя цена)
        //записываем в файл
        /*1. проходишься по сету
2. каждый элемент - а
3.снова цикл - только по продуктами, если категория.иквалс.а
тогда количествоЭлементов =+1
и сумма = сумма + прайс
среднее значение - сумма делить на колво
создаешь мэп
и добавляешь (а, среднее значение)*/
    }

    public void sorted()throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/com/zhenia/practicekolos/task2/productsList4"))) {
            //коллекция + компаратор = отсортированный список    //записываем в файл
            Collections.sort(listOfProducts, new ComporatorByPrice());
            for(int i = 0; i<listOfProducts.size(); i++) {
                bw.write(String.valueOf(listOfProducts.get(i).getPrice())+ " " +listOfProducts.get(i).getName() +"\n");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


/*ArrayList<Product> listOfProducts = new ArrayList<>();

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
    }*/

}
