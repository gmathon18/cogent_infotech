import React, { Component } from 'react'
import BookService from '../services/BookService'

class ListBookComponent extends Component {
  constructor(props) {
    super(props)

    this.state = {
      books: []
    }
    this.addBook = this.addBook.bind(this);
    this.editBook = this.editBook.bind(this);
    this.deleteBook = this.deleteBook.bind(this);
  }

  deleteBook(id) {
    BookService.deleteBook(id).then(res => {
      this.setState({ books: this.state.books.filter(book => book.id !== id) });
    });
  }
  viewBook(id) {
    this.props.history.push(`/view-book/${id}`);
  }
  editBook(id) {
    this.props.history.push(`/add-book/${id}`);
  }

  componentDidMount() {
    BookService.getBooks().then((res) => {
      this.setState({ books: res.data });
    });
  }

  addBook() {
    this.props.history.push('/add-book/_add');
  }

  render() {
    return (
      <div>
        <h2 id="morespace" className="text-center">Welcome to the Library!</h2>
        <div className="row">

          <button id="space" className="btn btn-primary" onClick={this.addBook}> Add Book</button>
        </div>
        <br></br>
        <div className="row">
          <table className="table table-striped table-bordered">

            <thead>
              <tr>
                <th> Title</th>
                <th> Price</th>
                <th> Crud Operation</th>
              </tr>
            </thead>
            <tbody>
              {
                this.state.books.map(
                  book =>
                    <tr key={book.id}>
                      <td> {book.title} </td>
                      <td> {book.price}</td>
                      <td>
                        <button onClick={() => this.editBook(book.id)} className="btn btn-info">Edit Book </button>
                        <button style={{ marginLeft: "10px" }} onClick={() => this.deleteBook(book.id)} className="btn btn-danger">Delete Book </button>
                      </td>
                    </tr>
                )
              }
            </tbody>
          </table>

        </div>

      </div>
    )
  }
}

export default ListBookComponent
