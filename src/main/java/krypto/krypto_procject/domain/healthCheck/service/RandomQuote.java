package krypto.krypto_procject.domain.healthCheck.service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RandomQuote {
    
    public String getQute(){
        Random random = new Random();
        return QUOTES.get(random.nextInt(QUOTES.size()));
    }

    private static final List<String> QUOTES = List.of(
            "Keep going, you're doing great!",
            "Success is the sum of small efforts repeated daily.",
            "Believe you can, and you're halfway there.",
            "Your hard work will pay off!",
            "Stay positive, work hard, and make it happen."
  );
}
