
public class Book {
	// required fields
	// book ID
	public int bookID;
	// book Title
	public String bookTitle;
	// book's current ratings
	public double averageRate;
	// number of reviews
	public int reviewCount;

	// default constructor
	public Book(int bookID, String bookTitle, int reviewCount) {
		super();
		this.bookID = bookID;
		this.bookTitle = bookTitle;
		// book rating is defaulted with 5 if reviewCount = 0
		if (reviewCount == 0) {
			this.averageRate = 5;
		}
		this.reviewCount = reviewCount;
	}

	// getter and setter methods
	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public double getBookRating() {
		return averageRate;
	}

	public void setBookRating(double averageRate) {
		this.averageRate = averageRate;
	}

	public int getReviewCount() {
		return reviewCount;
	}

	public void setReviewCount(int reviewCount) {
		this.reviewCount = reviewCount;
	}

	// given the newest Rating Score, it will update the average Rate
	public void updateRate(double newRatingScore) {
		// set the averageRate back to sum of all ratings
		// since average rate is total ratings / reviewCount
		this.averageRate *= reviewCount;

		// add the newRatingScore
		this.averageRate += newRatingScore;

		// use updateReviewCount method to increase number of reviews
		updateReviewCount();

		// find the new averageRate
		this.averageRate = this.averageRate / this.reviewCount;
	}

	// update reviewCount
	public void updateReviewCount() {
		// adds one to reviewCount since reviews are done one by one
		this.reviewCount++;
	}

	// toString method
	public String toString() {
		// String.format tow format the averageRate with two decimals
		return this.bookTitle + "\nBook ID: " + this.bookID + "\nBook rate: " + String.format("%.2f", this.averageRate)
				+ "\nNumber of reviews: " + this.reviewCount;
	}
}
