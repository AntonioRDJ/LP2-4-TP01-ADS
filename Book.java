public class Book {

  private String name;
  private Author[] authors;
  private double price;
  private int qty;

  public Book(String name, Author[] authors, double price) {
    this.name = name;
    this.authors = authors;
    this.price = price;
  }

  public Book(String name, Author[] authors, double price, int qty) {
    this.name = name;
    this.authors = authors;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return this.name;
  }

  public Author[] getAuthors() {
    return this.authors;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return this.qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public String toString() {
    String authors = "";
    for (Author author : this.authors) {
      authors += "Author[name="+author.getName()+",email="+author.getEmail()+",gender="+author.getGender()+"]";
      if(!this.authors[this.authors.length-1].equals(author)) {
        authors += ",";
      } 
    }
    return "Book[name="+this.name+",authors={"+authors+"},price="+this.price+",qty="+this.qty+"]";
  }

  public String getAuthorNames() {
    String names = "";
    for (Author author : authors) {
      names += author.getName() ;
      if(!authors[authors.length-1].equals(author)) {
        names += ",";
      }
    }
    return names;
  }
}
