package belajarspring.validation.Data;

import belajarspring.validation.validation.Palindrom;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Foo {

    @Palindrom
    private String bar;
}
