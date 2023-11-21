package belajarspring.validation.helper;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StringHelper {

    public boolean isPalindrom(String value){
        String reverse = new StringBuilder(value).reverse().toString();
        return value.equals(reverse);
    }

}
