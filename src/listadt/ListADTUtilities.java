package listadt;

import static listadt.ListAdtHelpers.disjointHelper;
import static listadt.ListAdtHelpers.equalsHelper;
import static listadt.ListAdtHelpers.swapHelper;

/**
 * A utility class that implements additional functionality for abstract data types and
 * uses higher order functions.
 */
public final class ListADTUtilities<T> extends ListADTImpl<T> {

  /**
   * Creates a new instance of ListADT that contains all of the specified elements in the
   * order they appeared in elements.
   *
   * @param elements The list of elements.
   * @return A ListADT object.
   * @throws IllegalArgumentException If elements contains one or more null values.
   */
  public static <T> ListADT<T> toList(T[] elements) throws IllegalArgumentException {
    ListADT listADT = new ListADTImpl();

    for (T element : elements) {
      if (element == null) {
        throw new IllegalArgumentException();
      } else {
        listADT.addBack(element);
      }
    }

    return listADT;
  }

  /**
   * This adds the specified elements to the end of the specified list.
   *
   * @param list A listADT object list.
   * @param elements The list of elements.
   * @throws IllegalArgumentException If elements contains one more more null values.
   */
  public static <T> void addAll(ListADT<T> list, T... elements) throws IllegalArgumentException {
    for (T element : elements) {
      if (element == null) {
        throw new IllegalArgumentException();
      } else {
        list.addBack(element);
      }
    }
  }

  /**
   * This will return the number of elements in the specified list equal to the specified element.
   *
   * @param list A listADT object list.
   * @param element An element object type.
   * @return The number of elements in the list.
   */
  public static <T> int frequency(ListADT<T> list, T element) {
    int counter = 0;

    for (int i = 0; i < list.getSize(); i++) {
      if (list.get(i) == element) {
        counter += 1;
      }
    }

    return counter;
  }

  /**
   * This will return true if the two lists have no elements in common.
   *
   * @param one The first list to be used for comparison.
   * @param two The second list to be used for comparison.
   * @return True if the two lists have no elements in common.
   * @throws IllegalArgumentException If either list is null or if either list contains
   *     a null element.
   */
  public static boolean disjoint(ListADT<?> one, ListADT<?> two) throws IllegalArgumentException {
    return disjointHelper(one, two);
  }


  /**
   * It will return true if the two lists are equal.
   *
   * @param one The first list.
   * @param two The second list.
   * @return True if the two lists are equal.
   * @throws IllegalArgumentException If either list is null or if either list contains
   *     a null element.
   */
  public static boolean equals(ListADT<?> one, ListADT<?> two) throws IllegalArgumentException {
    return equalsHelper(one, two);
  }


  /**
   * This swaps the elements at the specified position in the specified list.
   *
   * @param list The list of elements.
   * @param i Position one.
   * @param j Position two.
   * @throws IndexOutOfBoundsException If either i or j are out of range.
   */
  public void swap(ListADT<?> list, int i, int j) throws IndexOutOfBoundsException {
    swapHelper(list, i, j);
  }
}
