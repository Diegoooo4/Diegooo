package exam1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
<<<<<<< HEAD

@Nested
class ContainsVowelTest {
    @Test
    @DisplayName("Text with vowels minus")
    void ShouldRturnWithVowels() {
        //Arrange
        String str = "Hello world";
        boolean expected = true;
=======
@Nested
class ContainsVowelTest {
    @Test
    @DisplayName("Text with out vowels mayus")
    void ShouldRturnWithOutVowelsMays(){
        //Arrange
        String str = "HLL WRLD";
        boolean expected = false;
>>>>>>> 33123ce (Test sin vocales)

        //Act
        boolean actual = ContainsVowel.containsVowel(str);

        //Assert
        assertEquals(expected, actual);
    }
    @Test
<<<<<<< HEAD
    @DisplayName("Text with vowels mayus")
    void ShouldRturnWithVowelsMays(){
        //Arrange
        String str = "HELLO WORLD";
        boolean expected = true;

        //Act
        boolean actual = ContainsVowel.containsVowel(str);
=======
    @DisplayName("Text with out vowels minus")
    void ShouldRturnWithOutVowels(){
        //Arrange
        String str = "Hll wrld";
        boolean expected = false;

        //Act
        boolean actual = ContainsVowel.containsVowel(str);

>>>>>>> 33123ce (Test sin vocales)
        //Assert
        assertEquals(expected, actual);
    }
}
<<<<<<< HEAD
=======

>>>>>>> 33123ce (Test sin vocales)
