# Movie Catalog Project

A Java-based project that organizes and searches for movies, supporting different types of movies such as Action, Documentary, and Physical movies. This project handles exceptions and demonstrates the implementation of object-oriented principles like inheritance, interfaces, and exception handling.

## Table of Contents

- [Project Structure](#project-structure)
- [Features](#features)
- [Getting Started](#getting-started)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Code Overview](#code-overview)
- [Class Descriptions](#class-descriptions)
- [Exception Handling](#exception-handling)
- [Contributing](#contributing)
- [License](#license)

---

## Project Structure

The project includes the following Java classes:

- `Movie.java`
- `ActionMovie.java`
- `DocumentaryMovie.java`
- `PhysicalMovie.java`
- `MovieCatalog.java`
- `MovieSearcher.java`
- `Searchable.java` (Interface)
- `Format.java` (Enum or Class, depending on its use)
- `MovieException.java` (Custom Exception Class)
- `DuplicateMovieException.java` (Custom Exception Class)

## Features

- **Inheritance**: Base `Movie` class extended by `ActionMovie`, `DocumentaryMovie`, and `PhysicalMovie`.
- **Interface Implementation**: `Searchable` interface to ensure consistent search methods.
- **Exception Handling**: Custom exceptions like `MovieException` and `DuplicateMovieException` to handle specific errors.
- **Search Functionality**: Easily search for movies within the catalog.
- **Movie Catalog Management**: Add, remove, and search movies with ease.

---

## Getting Started

### Prerequisites

- Java Development Kit (JDK) version 8 or above.
- A code editor or IDE, such as IntelliJ IDEA, Eclipse, or Visual Studio Code.

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ndajani1/movie-catalog.git
