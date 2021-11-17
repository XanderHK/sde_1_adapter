package com.hz;

import java.util.Arrays;
import java.util.List;

public class ConsoleReaderAdapter {

    private final List<String> positives;
    private final ConsoleReader reader;

    public ConsoleReaderAdapter(ConsoleReader reader) {
        positives = Arrays.asList("yep", "true", "yes", "oh yeah", "great", "sure", "love to", "of course", "always", "never done otherwise");
        this.reader = reader;
    }

    public Boolean matches(){
        return positives.contains(reader.readLine());
    }
}
