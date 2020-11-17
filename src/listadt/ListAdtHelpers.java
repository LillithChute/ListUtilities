package listadt;

import java.util.HashSet;
import java.util.Set;

/**
 * These are helper functions for the ListADT class.
 */
public class ListAdtHelpers {
  /**
   * Helper function to deal with the wildcard.
   */
  static <T> boolean equalsHelper(ListADT<? extends T> one, ListADT<? extends T> two) {
    String strOne = "";
    String strTwo = "";

    if (one == null || two == null) {
      throw new IllegalArgumentException();
    }

    for (int i = 0; i < one.getSize(); i++) {
      if (one.get(i) == null) {
        throw new IllegalArgumentException();
      }

      strOne += one.get(i).toString();
    }

    for (int i = 0; i < two.getSize(); i++) {
      if (two.get(i) == null) {
        throw new IllegalArgumentException();
      }

      strTwo += two.get(i).toString();
    }


    return strOne.equals(strTwo);
  }

  /**
   * Helper function to deal with the wildcard.
   */
  static <T> boolean disjointHelper(ListADT<? extends T> one, ListADT<? extends T> two) {
    Set<T> setOne = new HashSet<>();

    if (one == null || two == null) {
      throw new IllegalArgumentException();
    }

    boolean hasSame = false;
    int oneSize = one.getSize();
    int twoSize = two.getSize();

    for (int i = 0; i < oneSize; i++) {
      if (one.get(i) == null) {
        throw new IllegalArgumentException();
      }

      setOne.add(one.get(i));
    }

    for (int i = 0; i < twoSize; i++) {
      if (two.get(i) == null) {
        throw new IllegalArgumentException();
      }

      if (setOne.contains(two.get(i))) {
        hasSame = true;
      }
    }

    return !hasSame;
  }

  /**
   * Helper function to deal with the wildcard.
   */
  static <T> void reverseHelper(ListADT<? extends T> list) {
    list.reverse();
  }

  /**
   * Helper function to deal with the wildcard.
   */
  static <T> void swapHelper(ListADT<? extends T> list, int i, int j) {
    if (i < 0 || j < 0 || i >= list.getSize() || j >= list.getSize()) {
      throw new IndexOutOfBoundsException();
    }

    list.swap(i, j);
  }
}
