package com.rachma.affirmations.data

import com.rachma.affirmations.R
import com.rachma.affirmations.model.Affirmation

// TODO 3 : Untuk mengisikan atau menyiapkan data yang akan ditampilkan
// Untuk mendeklarasikan fungsi berupa loadAffirmations()
// Untuk menampilkan data dari daftar Affirmations dengan mendeklarasikan instance Affirmation pada setiap string resource
class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}