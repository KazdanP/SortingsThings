import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class BubblesTest {

  @Test
  void bubbleSortTest() {
    int[] intsIWannaSort = {5, 4, 87, 3, 2, 34, 56, 34};
    int[] expectedSorted = {2, 3, 4, 5, 34, 34, 56, 87};

    int[] actualSorted = Bubbles.bubbleBubbles(intsIWannaSort);

    assertThat(actualSorted).isEqualTo(expectedSorted);
  }

  @Test
  void bubbleSortTestTwo() {
    int[] intsIWannaSort = {45, 654, 78, 234, 1, 1, 1, 12312, 43};
    int[] expectedSorted = {1, 1, 1, 43, 45, 78, 234, 654, 12312};

    int[] actualSorted = Bubbles.bubbleBubbles(intsIWannaSort);

    assertThat(actualSorted).isEqualTo(expectedSorted);
  }

  @Test
  void bubbleSortTestThree() {
    int[] intsIWannaSort = {};
    int[] expectedSorted = {};

    int[] actualSorted = Bubbles.bubbleBubbles(intsIWannaSort);

    assertThat(actualSorted).isEqualTo(expectedSorted);
  }

  @Test
  void bubbleSortTestFour() {
    int[] intsIWannaSort = {63,93,9,13,13,16,93,79,16,90,50,92,72,97,2,54,37,33,89,42,1,11,43,24,0,82,54,94,44,40,
            1,68,95,95,43,33,9,24,14,85,76,18,38,79,37,71,66,12,2,94,63,81,1,81,70,64,39,73,32,42,70,63,85,87,58,
            65,63,72,62,6,57,72,93,2,66,92,98,3,93,40,31,66,15,87,26,49,82,41,33,6,81,33,0,54,81,32,89,70,36,90,
            61,54,81,50,18,11,78,25,14,59,56,45,93,96,42,98,69,13,93,51,78,0,13,33,88,81,72,36,78,60,52,39,82,65,
            94,75,90,58,38,17,42,57,5,28,67,5,76,61,98,84,12,43,82,77,8,73,90,81,28,75,18,47,63,9,27,37,78,24,61,
            40,28,27,40,2,73,10,10,82,1,12,60,23,23,0,63,60,44,76,21,59,16,82,87,38,16,30,57,17,60,99,25,7,99,93,
            38,62,70,82,93,45,87,81,85,40,32,10,37,39,91,40,61,26,42,39,21,71,23,50,70,99,55,36,25,81,70,2,75,63,
            7,68,42,39,65,51,41,38,27,94,60,77,51,31,3,58,98,83,36,35,20,60,96,37,29,40,81,52,19,90,87,80,81,3,93,
            42,50,57,90,14,10,14,77,45,20,45,45,8,12,98,19,18,1,15,53,21,100,92,68,42,71,90,66,42,62,54,63,2,1,48,
            63,84,51,3,41,81,49,91,59,74,34,58,17,17,56,74,59,7,63,2,28,21,23,53,19,75,12,31,24,47,43,44,14,71,76,
            31,80,35,74,20,37,53,22,39,33,0,74,84,84,91,14,0,91,64,3,87,36,65,88,57,42,68,51,40,89,82,88,38,10,6,
            78,26,23,4,53,15,34,27,96,24,89,69,12,72,39,66,5,96,38,96,9,12,28,65,55,6,29,45,1,71,93,4,22,50,21,6,8,
            98,46,59,82,91,39,33,37,16,56,100,33,17,75,79,82,23,63,23,42,8,20,60,46,99,44,70,31,8,41,81,75,51,20,
            43,76,95,90,83,98,86,50,77,60,12,83,28,16,83,16,65,96,9,66,23,81,55,27,95,83,5,37,26,14,34,73,6,53,38,
            31,54,61,99,17,13,81,45,89,23,41,7,54,27,66,96,61,44,83,41,84,86,63,93,51,50,24,94,63,91,79,65,71,78,9,
            51,39,65,80,27,57,17,68,71,44,55,66,24,59,56,79,33,9,96,85,90,95,4,64,10,63,44,56,33,24,50,86,76,98,31,
            94,20,60,99,51,51,12,65,49,28,70,65,9,64,8,29,52,46,18,2,97,24,38,22,20,37,83,47,11,21,8,33,72,58,71,55,
            62,10,97,85,31,24,35,60,28,76,48,98,36,37,79,14,25,44,74,73,95,7,44,82,53,42,89,24,43,84,35,11,63,34,
            45,24,60,39,79,64,41,83,94,22,71,29,58,6,41,28,54,36,82,46,82,63,33,50,82,42,37,100,15,22,7,28,99,40,
            56,40,71,43,44,75,59,16,94,31,28,34,12,56,4,52,44,97,31,82,9,84,87,88,98,69,0,94,3,59,68,2,25,80,30,
            68,7,33,0,52,18,26,76,78,93,39,53,9,3,20,62,49,9,35,28,43,80,14,35,70,50,95,6,49,23,36,89,19,85,42,69,
            16,53,11,52,0,23,26,65,56,68,46,40,23,37,62,78,11,58,98,69,100,41,6,98,78,40,32,95,16,26,34,66,91,36,
            61,75,87,73,24,0,71,91,23,13,57,2,67,67,46,97,15,17,74,13,63,16,50,46,79,100,5,10,1,84,67,92,58,42,50,
            11,77,7,4,2,6,42,100,19,63,4,14,69,71,90,21,63,50,66,72,76,96,79,14,40,87,37,87,68,100,99,17,66,57,25,
            53,34,87,10,74,87,49,4,97,58,44,91,49,65,85,63,44,54,25,60,3,93,56,1,90,16,29,9,61,5,13,75,0,93,9,25,7,
            75,33,17,53,26,42,40,61,61,64,51,39,78,25,85,86,7,44,37,24,96,91,53,40,81,97,76,50,86,59,5,1,25,78,26,
            38,85,49,74,70,75,87,56,100,64,16,71,59,1,28,63,9,59,81,86,42,13,28,20,0,65,21,76,47,65,67,82,78,91,96,
            96,87,69,34,22,54,80,10,56,49,30,70,51,29,50,100,65,47,100,67,42,72,3,79,53,81,94,62,59,64,83,16,1,11,
            77,76,97,53,13,93,89,79,15,50,82,81,35,21,63,64,5,40,11,71,33,96,85,2,54,35};

    int[] expectedSorted = {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,
            3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9,9,
            9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,12,
            13,13,13,13,13,13,13,13,13,13,14,14,14,14,14,14,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,16,
            16,16,16,16,16,16,16,17,17,17,17,17,17,17,17,17,17,18,18,18,18,18,18,19,19,19,19,19,20,20,20,20,20,20,
            20,20,20,21,21,21,21,21,21,21,21,21,22,22,22,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,
            24,24,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,27,27,27,27,
            27,27,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,29,29,29,29,29,29,30,30,30,31,31,31,31,31,31,31,31,
            31,31,32,32,32,32,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,34,34,34,34,34,34,34,34,35,35,35,35,35,
            35,35,35,36,36,36,36,36,36,36,36,36,37,37,37,37,37,37,37,37,37,37,37,37,37,37,38,38,38,38,38,38,38,38,
            38,38,39,39,39,39,39,39,39,39,39,39,39,39,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,41,41,41,41,
            41,41,41,41,41,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,43,43,43,43,43,43,43,43,44,44,
            44,44,44,44,44,44,44,44,44,44,44,44,45,45,45,45,45,45,45,45,46,46,46,46,46,46,46,47,47,47,47,47,48,48,
            49,49,49,49,49,49,49,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,51,51,51,51,51,51,
            51,51,51,52,52,52,52,52,52,53,53,53,53,53,53,53,53,53,53,53,53,53,54,54,54,54,54,54,54,54,54,54,54,55,
            55,55,55,55,56,56,56,56,56,56,56,56,56,56,56,57,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,59,59,
            59,59,59,59,59,59,59,59,59,59,60,60,60,60,60,60,60,60,60,60,60,60,61,61,61,61,61,61,61,61,61,61,62,62,
            62,62,62,62,62,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,64,64,64,64,64,64,64,
            64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,66,66,67,67,67,67,67,67,
            68,68,68,68,68,68,68,68,68,69,69,69,69,69,69,69,70,70,70,70,70,70,70,70,70,70,70,71,71,71,71,71,71,71,
            71,71,71,71,71,71,71,72,72,72,72,72,72,72,72,73,73,73,73,73,73,74,74,74,74,74,74,74,74,75,75,75,75,75,
            75,75,75,75,75,75,76,76,76,76,76,76,76,76,76,76,76,76,77,77,77,77,77,77,78,78,78,78,78,78,78,78,78,78,
            78,78,79,79,79,79,79,79,79,79,79,79,79,80,80,80,80,80,80,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,
            81,81,81,81,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,84,84,84,84,
            84,84,84,84,85,85,85,85,85,85,85,85,85,85,86,86,86,86,86,86,87,87,87,87,87,87,87,87,87,87,87,87,87,87,
            88,88,88,88,89,89,89,89,89,89,89,89,90,90,90,90,90,90,90,90,90,90,90,91,91,91,91,91,91,91,91,91,91,91,
            92,92,92,92,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,94,94,94,94,94,94,94,94,94,94,95,95,95,95,95,
            95,95,95,96,96,96,96,96,96,96,96,96,96,96,96,96,97,97,97,97,97,97,97,97,98,98,98,98,98,98,98,98,98,98,
            98,98,99,99,99,99,99,99,99,99,100,100,100,100,100,100,100,100,100,100};

    int[] actualSorted = Bubbles.bubbleBubbles(intsIWannaSort);

    assertThat(actualSorted).isEqualTo(expectedSorted);
  }

  @Test
  void bubbleSortTestFive() {
    int[] intsIWannaSort = {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,
            3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9,9,
            9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,12,
            13,13,13,13,13,13,13,13,13,13,14,14,14,14,14,14,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,16,
            16,16,16,16,16,16,16,17,17,17,17,17,17,17,17,17,17,18,18,18,18,18,18,19,19,19,19,19,20,20,20,20,20,20,
            20,20,20,21,21,21,21,21,21,21,21,21,22,22,22,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,
            24,24,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,27,27,27,27,
            27,27,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,29,29,29,29,29,29,30,30,30,31,31,31,31,31,31,31,31,
            31,31,32,32,32,32,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,34,34,34,34,34,34,34,34,35,35,35,35,35,
            35,35,35,36,36,36,36,36,36,36,36,36,37,37,37,37,37,37,37,37,37,37,37,37,37,37,38,38,38,38,38,38,38,38,
            38,38,39,39,39,39,39,39,39,39,39,39,39,39,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,41,41,41,41,
            41,41,41,41,41,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,43,43,43,43,43,43,43,43,44,44,
            44,44,44,44,44,44,44,44,44,44,44,44,45,45,45,45,45,45,45,45,46,46,46,46,46,46,46,47,47,47,47,47,48,48,
            49,49,49,49,49,49,49,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,51,51,51,51,51,51,
            51,51,51,52,52,52,52,52,52,53,53,53,53,53,53,53,53,53,53,53,53,53,54,54,54,54,54,54,54,54,54,54,54,55,
            55,55,55,55,56,56,56,56,56,56,56,56,56,56,56,57,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,59,59,
            59,59,59,59,59,59,59,59,59,59,60,60,60,60,60,60,60,60,60,60,60,60,61,61,61,61,61,61,61,61,61,61,62,62,
            62,62,62,62,62,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,64,64,64,64,64,64,64,
            64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,66,66,67,67,67,67,67,67,
            68,68,68,68,68,68,68,68,68,69,69,69,69,69,69,69,70,70,70,70,70,70,70,70,70,70,70,71,71,71,71,71,71,71,
            71,71,71,71,71,71,71,72,72,72,72,72,72,72,72,73,73,73,73,73,73,74,74,74,74,74,74,74,74,75,75,75,75,75,
            75,75,75,75,75,75,76,76,76,76,76,76,76,76,76,76,76,76,77,77,77,77,77,77,78,78,78,78,78,78,78,78,78,78,
            78,78,79,79,79,79,79,79,79,79,79,79,79,80,80,80,80,80,80,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,
            81,81,81,81,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,84,84,84,84,
            84,84,84,84,85,85,85,85,85,85,85,85,85,85,86,86,86,86,86,86,87,87,87,87,87,87,87,87,87,87,87,87,87,87,
            88,88,88,88,89,89,89,89,89,89,89,89,90,90,90,90,90,90,90,90,90,90,90,91,91,91,91,91,91,91,91,91,91,91,
            92,92,92,92,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,94,94,94,94,94,94,94,94,94,94,95,95,95,95,95,
            95,95,95,96,96,96,96,96,96,96,96,96,96,96,96,96,97,97,97,97,97,97,97,97,98,98,98,98,98,98,98,98,98,98,
            98,98,99,99,99,99,99,99,99,99,100,100,100,100,100,100,100,100,100,100};

    int[] expectedSorted = {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,
            3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9,9,
            9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,12,
            13,13,13,13,13,13,13,13,13,13,14,14,14,14,14,14,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,16,
            16,16,16,16,16,16,16,17,17,17,17,17,17,17,17,17,17,18,18,18,18,18,18,19,19,19,19,19,20,20,20,20,20,20,
            20,20,20,21,21,21,21,21,21,21,21,21,22,22,22,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,
            24,24,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,27,27,27,27,
            27,27,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,29,29,29,29,29,29,30,30,30,31,31,31,31,31,31,31,31,
            31,31,32,32,32,32,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,34,34,34,34,34,34,34,34,35,35,35,35,35,
            35,35,35,36,36,36,36,36,36,36,36,36,37,37,37,37,37,37,37,37,37,37,37,37,37,37,38,38,38,38,38,38,38,38,
            38,38,39,39,39,39,39,39,39,39,39,39,39,39,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,41,41,41,41,
            41,41,41,41,41,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,43,43,43,43,43,43,43,43,44,44,
            44,44,44,44,44,44,44,44,44,44,44,44,45,45,45,45,45,45,45,45,46,46,46,46,46,46,46,47,47,47,47,47,48,48,
            49,49,49,49,49,49,49,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,51,51,51,51,51,51,
            51,51,51,52,52,52,52,52,52,53,53,53,53,53,53,53,53,53,53,53,53,53,54,54,54,54,54,54,54,54,54,54,54,55,
            55,55,55,55,56,56,56,56,56,56,56,56,56,56,56,57,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,59,59,
            59,59,59,59,59,59,59,59,59,59,60,60,60,60,60,60,60,60,60,60,60,60,61,61,61,61,61,61,61,61,61,61,62,62,
            62,62,62,62,62,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,64,64,64,64,64,64,64,
            64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,66,66,67,67,67,67,67,67,
            68,68,68,68,68,68,68,68,68,69,69,69,69,69,69,69,70,70,70,70,70,70,70,70,70,70,70,71,71,71,71,71,71,71,
            71,71,71,71,71,71,71,72,72,72,72,72,72,72,72,73,73,73,73,73,73,74,74,74,74,74,74,74,74,75,75,75,75,75,
            75,75,75,75,75,75,76,76,76,76,76,76,76,76,76,76,76,76,77,77,77,77,77,77,78,78,78,78,78,78,78,78,78,78,
            78,78,79,79,79,79,79,79,79,79,79,79,79,80,80,80,80,80,80,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,
            81,81,81,81,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,84,84,84,84,
            84,84,84,84,85,85,85,85,85,85,85,85,85,85,86,86,86,86,86,86,87,87,87,87,87,87,87,87,87,87,87,87,87,87,
            88,88,88,88,89,89,89,89,89,89,89,89,90,90,90,90,90,90,90,90,90,90,90,91,91,91,91,91,91,91,91,91,91,91,
            92,92,92,92,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,94,94,94,94,94,94,94,94,94,94,95,95,95,95,95,
            95,95,95,96,96,96,96,96,96,96,96,96,96,96,96,96,97,97,97,97,97,97,97,97,98,98,98,98,98,98,98,98,98,98,
            98,98,99,99,99,99,99,99,99,99,100,100,100,100,100,100,100,100,100,100};

    int[] actualSorted = Bubbles.bubbleBubbles(intsIWannaSort);

    assertThat(actualSorted).isEqualTo(expectedSorted);
  }

  @Test
  void bubbleSortTestSix() {
    int[] intsIWannaSort = {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,
            3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9,9,
            9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,12,
            13,13,13,13,13,13,13,13,13,13,14,14,14,14,14,14,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,16,
            16,16,16,16,16,16,16,17,17,17,17,17,17,17,17,17,17,18,18,18,18,18,18,19,19,19,19,19,20,20,20,20,20,20,
            20,20,20,21,21,21,21,21,21,21,21,21,22,22,22,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,
            24,24,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,27,27,27,27,
            27,27,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,29,29,29,29,29,29,30,30,30,31,31,31,31,31,31,31,31,
            31,31,32,32,32,32,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,34,34,34,34,34,34,34,34,35,35,35,35,35,
            35,35,35,36,36,36,36,36,36,36,36,36,37,37,37,37,37,37,37,37,37,37,37,37,37,37,38,38,38,38,38,38,38,38,
            38,38,39,39,39,39,39,39,39,39,39,39,39,39,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,41,41,41,41,
            41,41,41,41,41,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,43,43,43,43,43,43,43,43,44,44,
            44,44,44,44,44,44,44,44,44,44,44,44,45,45,45,45,45,45,45,45,46,46,46,46,46,46,46,47,47,47,47,47,48,48,
            49,49,49,49,49,49,49,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,51,51,51,51,51,51,
            51,51,51,52,52,52,52,52,52,53,53,53,53,53,53,53,53,53,53,53,53,53,54,54,54,54,54,54,54,54,54,54,54,55,
            55,55,55,55,56,56,56,56,56,56,56,56,56,56,56,57,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,59,59,
            59,59,59,59,59,59,59,59,59,59,60,60,60,60,60,60,60,60,60,60,60,60,61,61,61,61,61,61,61,61,61,61,62,62,
            62,62,62,62,62,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,64,64,64,64,64,64,64,
            64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,66,66,67,67,67,67,67,67,
            68,68,68,68,68,68,68,68,68,69,69,69,69,69,69,69,70,70,70,70,70,70,70,70,70,70,70,71,71,71,71,71,71,71,
            71,71,71,71,71,71,71,72,72,72,72,72,45,72,72,73,73,73,73,73,73,74,74,74,74,74,74,74,74,75,75,75,75,75,
            75,75,75,75,75,75,76,76,76,76,76,76,76,76,76,76,76,76,77,77,77,77,77,77,78,78,78,78,78,78,78,78,78,78,
            78,78,79,79,79,79,79,79,79,79,79,79,79,80,80,80,80,80,80,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,
            81,81,81,81,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,84,84,84,84,
            84,84,84,84,85,85,85,85,85,85,85,85,85,85,86,86,86,86,86,86,87,87,87,87,87,87,87,87,87,87,87,87,87,87,
            88,88,88,88,89,89,89,89,89,89,89,89,90,90,90,90,90,90,90,90,90,90,90,91,91,91,91,91,91,91,91,91,91,91,
            92,92,92,92,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,94,94,94,94,94,94,94,94,94,94,95,95,95,95,95,
            95,95,95,96,96,96,96,96,96,96,96,96,96,96,96,96,97,97,97,97,97,97,97,97,98,98,98,98,98,98,98,98,98,98,
            98,98,99,99,99,99,99,99,99,99,100,100,100,100,100,100,100,100,100,100};

    int[] expectedSorted = {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,
            3,3,4,4,4,4,4,4,4,5,5,5,5,5,5,5,5,6,6,6,6,6,6,6,6,6,6,7,7,7,7,7,7,7,7,7,7,8,8,8,8,8,8,8,9,9,9,9,9,9,9,
            9,9,9,9,9,9,9,10,10,10,10,10,10,10,10,10,10,11,11,11,11,11,11,11,11,11,12,12,12,12,12,12,12,12,12,12,
            13,13,13,13,13,13,13,13,13,13,14,14,14,14,14,14,14,14,14,14,14,15,15,15,15,15,15,16,16,16,16,16,16,16,
            16,16,16,16,16,16,16,17,17,17,17,17,17,17,17,17,17,18,18,18,18,18,18,19,19,19,19,19,20,20,20,20,20,20,
            20,20,20,21,21,21,21,21,21,21,21,21,22,22,22,22,22,22,23,23,23,23,23,23,23,23,23,23,23,23,23,24,24,24,
            24,24,24,24,24,24,24,24,24,24,24,25,25,25,25,25,25,25,25,25,25,26,26,26,26,26,26,26,26,26,27,27,27,27,
            27,27,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,29,29,29,29,29,29,30,30,30,31,31,31,31,31,31,31,31,
            31,31,32,32,32,32,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,34,34,34,34,34,34,34,34,35,35,35,35,35,
            35,35,35,36,36,36,36,36,36,36,36,36,37,37,37,37,37,37,37,37,37,37,37,37,37,37,38,38,38,38,38,38,38,38,
            38,38,39,39,39,39,39,39,39,39,39,39,39,39,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,41,41,41,41,
            41,41,41,41,41,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,43,43,43,43,43,43,43,43,44,44,
            44,44,44,44,44,44,44,44,44,44,44,44,45,45,45,45,45,45,45,45,45,46,46,46,46,46,46,46,47,47,47,47,47,48,48,
            49,49,49,49,49,49,49,49,49,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51,51,51,51,51,51,51,51,51,
            51,51,51,52,52,52,52,52,52,53,53,53,53,53,53,53,53,53,53,53,53,53,54,54,54,54,54,54,54,54,54,54,54,55,
            55,55,55,55,56,56,56,56,56,56,56,56,56,56,56,57,57,57,57,57,57,57,57,58,58,58,58,58,58,58,58,58,59,59,
            59,59,59,59,59,59,59,59,59,59,60,60,60,60,60,60,60,60,60,60,60,60,61,61,61,61,61,61,61,61,61,61,62,62,
            62,62,62,62,62,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,63,64,64,64,64,64,64,64,
            64,64,65,65,65,65,65,65,65,65,65,65,65,65,65,65,65,66,66,66,66,66,66,66,66,66,66,66,67,67,67,67,67,67,
            68,68,68,68,68,68,68,68,68,69,69,69,69,69,69,69,70,70,70,70,70,70,70,70,70,70,70,71,71,71,71,71,71,71,
            71,71,71,71,71,71,71,72,72,72,72,72,72,72,73,73,73,73,73,73,74,74,74,74,74,74,74,74,75,75,75,75,75,
            75,75,75,75,75,75,76,76,76,76,76,76,76,76,76,76,76,76,77,77,77,77,77,77,78,78,78,78,78,78,78,78,78,78,
            78,78,79,79,79,79,79,79,79,79,79,79,79,80,80,80,80,80,80,81,81,81,81,81,81,81,81,81,81,81,81,81,81,81,
            81,81,81,81,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,82,83,83,83,83,83,83,83,83,83,84,84,84,84,
            84,84,84,84,85,85,85,85,85,85,85,85,85,85,86,86,86,86,86,86,87,87,87,87,87,87,87,87,87,87,87,87,87,87,
            88,88,88,88,89,89,89,89,89,89,89,89,90,90,90,90,90,90,90,90,90,90,90,91,91,91,91,91,91,91,91,91,91,91,
            92,92,92,92,93,93,93,93,93,93,93,93,93,93,93,93,93,93,93,94,94,94,94,94,94,94,94,94,94,95,95,95,95,95,
            95,95,95,96,96,96,96,96,96,96,96,96,96,96,96,96,97,97,97,97,97,97,97,97,98,98,98,98,98,98,98,98,98,98,
            98,98,99,99,99,99,99,99,99,99,100,100,100,100,100,100,100,100,100,100};

    int[] actualSorted = Bubbles.bubbleBubbles(intsIWannaSort);

    assertThat(actualSorted).isEqualTo(expectedSorted);
  }

}
