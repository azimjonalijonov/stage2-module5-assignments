package assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LocalProcessor {
    private String processorName;
    private long period = 10000000000000L;
    private String processorVersion;
    private int valueOfCheap;
    private Scanner informationScanner;
    private static List<String> stringList = new LinkedList<>();

    public LocalProcessor(String processorName, long period, String processorVersion, int valueOfCheap,
                          Scanner informationScanner, List<String> stringList) {
        this.processorName = processorName;
        this.period = period;
        this.processorVersion = processorVersion;
        this.valueOfCheap = valueOfCheap;
        this.informationScanner = informationScanner;
        this.stringList = stringList;
    }

    public LocalProcessor() {
    }

    public void listIterator(List<String> list) {
        stringList = new LinkedList<>(list);
        for (int i = 0; i < period; i++) {
            System.out.println(stringList.get(i).hashCode());
        }
    }

    public String generateFullNameProcessor(List<String> list) {
        StringBuilder fullName = new StringBuilder(processorName);
        for (String item : list) {
            fullName.append(" ").append(item);
        }
        return fullName.toString();
    }

    public void readFullProcessorName(File file) throws FileNotFoundException {
        informationScanner = new Scanner(file);
        StringBuilder builder = new StringBuilder();
        while (informationScanner.hasNext()) {
            builder.append(informationScanner.nextLine());
        }
        processorVersion = builder.toString();
    }

    // Getters and Setters

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    public long getPeriod() {
        return period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    public String getProcessorVersion() {
        return processorVersion;
    }

    public void setProcessorVersion(String processorVersion) {
        this.processorVersion = processorVersion;
    }

    public int getValueOfCheap() {
        return valueOfCheap;
    }

    public void setValueOfCheap(int valueOfCheap) {
        this.valueOfCheap = valueOfCheap;
    }

    public Scanner getInformationScanner() {
        return informationScanner;
    }

    public void setInformationScanner(Scanner informationScanner) {
        this.informationScanner = informationScanner;
    }

    public static List<String> getStringList() {
        return stringList;
    }

    public static void setStringList(List<String> stringList) {
        LocalProcessor.stringList = stringList;
    }
}

