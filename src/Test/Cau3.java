package Test;

import java.io.*;

public class Cau3 {
    public static void main(String[] args) {
        String[] arrayProgramLanguage = {
                "PHP",
                "Java",
                "Ruby on Rails",
                "HTML",
                "CSS",
                "React JS",
                "JavaScript",
                "React Native",
                "Angular"
        };
        try {
            String fileName = "language.txt";
            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }
            writeDataToFile(fileName, arrayProgramLanguage);
            System.out.println(readDataFromFile(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static boolean writeDataToFile(String fileName, String[] arrayProgramLanguage) throws IOException {
        if (arrayProgramLanguage != null) {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            int count = 0;
            while (count < arrayProgramLanguage.length) {
                bufferedWriter.write(arrayProgramLanguage[count] + "\n");
                count++;
            }
            bufferedWriter.close();
            return true;
        }
        return false;
    }

    public static String readDataFromFile(String fileName) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        String text = null;
        while ((line = bufferedReader.readLine()) != null) {
            text += "\n" + line;
        }
        return text;
    }
}




