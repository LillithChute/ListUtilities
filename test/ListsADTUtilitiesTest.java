import org.junit.Before;
import org.junit.Test;

import listadt.ListADT;
import listadt.ListADTImpl;
import listadt.ListADTUtilities;

import static org.junit.Assert.assertEquals;

/**
 * Test of the ListADTUtilities class.
 */
public class ListsADTUtilitiesTest {

  ListADTUtilities<String> obj;
  ListADTUtilities<Integer> objInt;
  ListADT<String> target;
  ListADT<String> target2;
  ListADT<Integer> targetInt;

  @Before
  public void setUp() {
    obj = new ListADTUtilities<>();
    objInt = new ListADTUtilities<>();
    target = new ListADTImpl<>();
    target2 = new ListADTImpl<>();
    targetInt = new ListADTImpl<>();
  }

  /**
   * This tests Add, Remove, and toString.
   */
  @Test
  public void testStringLinkedList() {
    target.add(0, "won");
    target.add(1, "Patriots");
    target.add(2, "Super");
    target.add(3, "Bowl");
    target.add(4, "the");
    assertEquals("(won Patriots Super Bowl the)", target.toString());
    assertEquals(5, target.getSize());
    assertEquals("Bowl", target.get(3));

    target.remove("Patriots");
    target.add(0, "Falcons");
    target.add(1, "did");
    target.add(2, "not");
    target.remove("won");
    target.add(3, "win");
    assertEquals("(Falcons did not win Super Bowl the)",
            target.toString());
    assertEquals(7, target.getSize());

  }

  /**
   * This tests Add and Swap.
   */
  @Test
  public void testSwap() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    assertEquals("(I am a teacher)", target.toString());
    obj.swap(target, 0, 2);
    assertEquals("(I am I teacher)", target.toString());
  }

  @Test(expected = IndexOutOfBoundsException.class)
  public void testSwapBad() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    assertEquals("(I am a teacher)", target.toString());
    obj.swap(target, 0, 4);
    assertEquals("(I am I teacher)", target.toString());
  }

  @Test
  public void testToList() {
    targetInt.addFront(Integer.valueOf(5));
    targetInt.addFront(Integer.valueOf(4));
    targetInt.addFront(Integer.valueOf(3));
    targetInt.addFront(Integer.valueOf(2));
    targetInt.addFront(Integer.valueOf(1));

    Integer[] list = new Integer[]{1, 2, 3, 4, 5};

    assertEquals(targetInt.toString(), objInt.toList(list).toString());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testToListBad() {
    targetInt.addFront(Integer.valueOf(5));
    targetInt.addFront(Integer.valueOf(4));
    targetInt.addFront(Integer.valueOf(3));
    targetInt.addFront(Integer.valueOf(2));
    targetInt.addFront(Integer.valueOf(1));

    Integer[] list = new Integer[]{1, 2, 3, null, 5};

    assertEquals(targetInt.toString(), objInt.toList(list).toString());
  }

  @Test
  public void testAddAll() {
    targetInt.addFront(Integer.valueOf(5));
    targetInt.addFront(Integer.valueOf(4));
    targetInt.addFront(Integer.valueOf(3));
    targetInt.addFront(Integer.valueOf(2));
    targetInt.addFront(Integer.valueOf(1));

    Integer[] list = new Integer[]{1, 2, 3, 4, 5};

    assertEquals(targetInt.toString(), objInt.toList(list).toString());
  }

  @Test
  public void frequencyTest() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");
    target.add(4, "I");
    target.add(5, "I");

    assertEquals(3, obj.frequency(target, "I"));
  }

  @Test
  public void disjointTestFalse() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    target2.add(0, "I");
    target2.add(1, "am");
    target2.add(2, "a");
    target2.add(3, "farmer");

    assertEquals(false, obj.disjoint(target, target2));
  }

  @Test
  public void disjointTestTrue() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    target2.add(0, "It");
    target2.add(1, "to");
    target2.add(2, "at");
    target2.add(3, "arm");

    assertEquals(true, obj.disjoint(target, target2));
  }

  @Test(expected = IllegalArgumentException.class)
  public void disjointTestBad() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    target2 = null;

    assertEquals(true, obj.disjoint(target, target2));
  }

  @Test
  public void equalsTestTrue() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    target2.add(0, "I");
    target2.add(1, "am");
    target2.add(2, "a");
    target2.add(3, "teacher");

    assertEquals(true, obj.equals(target, target2));
  }

  @Test
  public void equalsTestFalse() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    target2.add(0, "I");
    target2.add(1, "am");
    target2.add(2, "a");
    target2.add(3, "farmer");

    assertEquals(false, obj.equals(target, target2));
  }

  @Test(expected = IllegalArgumentException.class)
  public void equalsTestBad() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");

    target2 = null;

    assertEquals(false, obj.equals(target, target2));
  }

  @Test
  public void swapTest() {
    target.add(0, "I");
    target.add(1, "am");
    target.add(2, "a");
    target.add(3, "teacher");


    assertEquals(false, obj.equals(target, target2));
  }
}
