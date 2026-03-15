package OopsLearning

/** Represents a writer with a first name, last name, and year of birth.
 *
 * @param firstName The writer's first name.
 * @param lastName The writer's last name.
 * @param year The writer's year of birth.
 */
class Writer(firstName: String, lastName: String, val year: Int) {

  /** Returns the full name of the writer. */
  def fullName(): String = {
    s"$firstName $lastName"
  }
}

/** Represents a novel with a name, year of publication, and author.
 *
 * @param name The name of the novel.
 * @param year The year the novel was published.
 * @param author The author of the novel.
 */
class Novel(val name: String, val year: Int, val author: Writer) {

  /** The age of the author when the novel was published. */
  val authorAgeAtPublication: Int = year - author.year

  /** Checks if the novel was written by the given author.
   *
   * @param author The author to check.
   * @return True if the novel was written by the given author, false otherwise.
   */
  def isWrittenBy(author: Writer): Boolean = {
    this.author == author
  }

  /** Creates a copy of the novel with a new publication year.
   *
   * @param newYear The new year for the copied novel.
   * @return A new Novel instance with the updated year.
   */
  def copyWithNewYear(newYear: Int): Novel = {
    new Novel(name, newYear, author)
  }
}

/** A simple immutable counter class. */
class Counter(val count: Int = 0) {

  /** Increment the counter by 1 (returns a new Counter). */
  def inc: Counter = {
    println(s"Incrementing count: $count")
    new Counter(count + 1)
  }

  /** Decrement the counter by 1 (returns a new Counter). */
  def dec: Counter = {
    println(s"Decrementing count: $count")
    new Counter(count - 1)
  }

  /** Increment the counter by n recursively. */
  def incrementBy(n: Int): Counter = {
    if (n <= 0) this
    else inc.incrementBy(n - 1)
  }

  /** Decrement the counter by n recursively. */
  def decrementBy(n: Int): Counter = {
    if (n <= 0) this
    else dec.decrementBy(n - 1)
  }
}

/** Main object to demonstrate OOP concepts with Writer, Novel, and Counter. */
object ExeriseOops extends App {
  val author = new Writer("Abhishek", "Nangare", 2002)
  val novel = new Novel("Scala OOPs", 2023, author)

  println(s"Author: ${author.fullName()}, Age at publication: ${novel.authorAgeAtPublication}")
  println(s"Novel: ${novel.name}, Written by original author: ${novel.isWrittenBy(author)}")

  val copiedNovel = novel.copyWithNewYear(2024)
  println(s"Copied Novel Year: ${copiedNovel.year}, Author Age: ${copiedNovel.authorAgeAtPublication}")

  val counter = new Counter()
  val incrementedCounter = counter.incrementBy(5)
  println(s"Counter after incrementing 5 times: ${incrementedCounter.count}")
  val decrementedCounter = incrementedCounter.decrementBy(3)
  println(s"Counter after decrementing 3 times: ${decrementedCounter.count}")
}
