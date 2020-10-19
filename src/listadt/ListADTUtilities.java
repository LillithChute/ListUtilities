package listadt;

/**
 * A utility class that implements additional functionality for abstract data types and
 * uses higher order functions.
 */
public final class ListADTUtilities {

  /**
   * Creates a new instance of ListADT that contains all of the specified elements in the
   * order they appeared in elements.
   *
   * @param elements The list of elements.
   * @return A ListADT object.
   * @throws IllegalArgumentException If elements contains one or more null values.
   */
  public static <T> ListADT<T> toList(T[] elements) throws IllegalArgumentException {
    return null;
  }

  /**
   * This adds the specified elements to the end of the specified list.
   *
   * @param list A listADT object list.
   * @param elements The list of elements.
   * @throws IllegalArgumentException If elements contains one more more null values.
   */
  public static <T> void addAll(ListADT<T> list, T... elements) throws IllegalArgumentException {
  }

  /**
   * This will return the number of elements in the specified list equal to the specified element.
   *
   * @param list A listADT object list.
   * @param element An element object type.
   * @return The number of elements in the list.
   */
  <T> int frequency(ListADT<T> list, T element) {
    return 0;
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
  boolean disjoint(ListADT<?> one, ListADT<?> two) throws IllegalArgumentException {
    return false;
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
  boolean equals(ListADT<?> one, ListADT<?> two) throws IllegalArgumentException {
    return false;
  }

  /**
   * Reverses the order of the elements in the specified list.
   *
   * @param list The list to reverse.
   */
  void reverse(ListADT<?> list) {
  }

  /**
   * This swaps the elements at the specified position in the specified list.
   *
   * @param list The list of elements.
   * @param i Position one.
   * @param j Position two.
   * @throws IndexOutOfBoundsException If either i or j are out of range.
   */
  void swap(ListADT<?> list, int i, int j) throws IndexOutOfBoundsException {
  }
}
