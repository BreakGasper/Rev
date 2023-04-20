package com.breakapp.rev.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface RevDao {
    @Query("SELECT * FROM rev_entity")
    suspend fun getAllPokemons(): List<RevEntity>

    @Insert
    suspend fun addPokemon(pokeEntity: RevEntity)

    @Query("SELECT * FROM rev_entity where id like :id")
    suspend fun getPokemonById(id:Long): RevEntity

    @Delete
    suspend fun deletePokemon(pokeEntity: RevEntity)

    @Update
    suspend fun updatePokemon(pokeEntity: RevEntity)
}