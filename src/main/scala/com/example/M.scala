package com.example

object M:
  // case class Address(street: String, zipCode: String)
  // sealed trait People {
  //   def name: String
  //   def age: Int
  //   def address: Address
  // }
  case class Person(name: String, age: Int)
  // case class Gamer(
  //     name: String,
  //     age: Int,
  //     address: Address,
  //     favoriteGame: String
  // ) extends People

export M.*
