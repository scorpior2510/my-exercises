# Exercise: Simple Regex Exercises

## Details
- Exercise Type: ChatGpt Generated
- Num of Exercises: 7

## ChatGpt Prompt
generate 7 simple regex exercises

## Description

### 1. Match a word

Regex: hello
Test Strings: "hello world", "say hello", "HELLO"
Goal: Match occurrences of the word "hello" (case-sensitive).

### 2. Match a digit

Regex: \d
Test Strings: "abc123", "price: 9", "no numbers here"
Goal: Match any single digit.

### 3. Match a sequence of digits

Regex: \d+
Test Strings: "There are 42 apples", "12345", "A1B2C3"
Goal: Match one or more consecutive digits.

### 4. Match an email address

Regex: \w+@\w+\.\w+
Test Strings: "contact me at test@example.com", "invalid@com", "user.name@domain.org"
Goal: Match basic email addresses.

### 5. Match a word with only lowercase letters

Regex: ^[a-z]+$
Test Strings: "hello", "Hello", "hello123"
Goal: Match words containing only lowercase letters.

### 6. Match a date in YYYY-MM-DD format

Regex: \d{4}-\d{2}-\d{2}
Test Strings: "2024-03-22", "99-99-9999", "Date: 2023-12-31"
Goal: Match properly formatted dates.

### 7. Match a word that starts with 'A' or 'a'

Regex: \b[Aa]\w*
Test Strings: "Apple is good", "an example", "banana"
Goal: Match words that begin with 'A' or 'a'.