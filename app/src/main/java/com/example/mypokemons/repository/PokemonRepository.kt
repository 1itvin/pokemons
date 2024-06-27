package com.example.mypokemons.repository

import com.example.mypokemons.R
import com.example.mypokemons.model.Pokemon

object PokemonList {
    val pokemons: HashMap<Int, Pokemon?> = hashMapOf(
            1 to Pokemon(
                id = 1,
                name = "Bulbasaur",
                image = R.drawable.bulbasaur,
                type = "grass",
                weight = 69,
                height = 7,
            ),

            2 to Pokemon(
                id = 2,
                name = "Charmander",
                image = R.drawable.charmander,
                type = "fire",
                weight = 85,
                height = 6,
            ),

            3 to Pokemon(
                id = 3,
                name = "Squirtle",
                image = R.drawable.squirtle,
                type = "water",
                weight = 90,
                height = 5,
            ),

            4 to Pokemon(
                id = 4,
                name = "Caterpie",
                image = R.drawable.caterpie,
                type = "bug",
                weight = 29,
                height = 3,
            ),
        )
}
