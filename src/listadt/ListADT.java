package listadt;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * This interface represents a generic list. It is a generalization of the
 * BookListADT interface.
 * We represent the type of data that this will work with a generic parameter T.
 * This is a placeholder for the actual data type.
 *
 * @param <T> the type of element in thee list
 */
public interface ListADT<T> {
  /**
   * Add an object to the front of this list.
   *
   * @param b the object to be added to the front of this list
   */
  void addFront(T b);

  /**
   * Add an object to the back of this list (so it is the last object in the
   * list.
   *
   * @param b the object to be added to teh back of this list
   */
  void addBack(T b);

  /**
   * Add an object to this list so that it occupies the provided index. Index
   * begins with 0
   *
   * @param index the index to be occupied by this object, beginning at 0
   * @param b     the object to be added to the list
   */
  void add(int index, T b);

  /**
   * Return the number of objects currently in this list.
   *
   * @return the size of the list
   */
  int getSize();

  /**
   * Remove the first instance of this object from this list.
   *
   * @param b the object to be removed
   */
  void remove(T b);

  /**
   * Get the (index)th object in this list.
   *
   * @param index the index of the object to be returned
   * @return the object at the given index
   * @throws IllegalArgumentException if an invalid index is passed
   */
  T get(int index) throws IllegalArgumentException;

  /**
   * Reverses the items in the List.
   */
  void reverse();

  /**
   * This swaps to items in the list.
   *
   * @param leftIndex The left item.
   * @param rightIndex The right item.
   */
  void swap(int leftIndex, int rightIndex);

  /**
   * A general map higher order function on nodes. This returns a list of
   * identical structure, but each data item of type T converted into R using
   * the provided converter method.
   *
   * @param converter the function needed to convert T into R
   * @param <R>       the type of the data in the returned list
   * @return the head of a list that is structurally identical to this list, but
   *         contains data of type R
   */
  <R> ListADT<R> map(Function<T, R> converter);

  ListADT<T> filter(Predicate<T> predicate);

  T fold(T identity, BinaryOperator<T> accumulator);
}
