/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package People;

/**
 *
 * @author Mark
 */
interface Dohodnost {
    final int MINIMALNIJ_DOHOD =200;
    final int VISOKIJ_PEREVES = 500;
    final int MINIMALNIJ_PEREVES = 400;
    String urovenDohodnosti();
}

interface ZarobotnajaPlata {
    final int TEKUSHAJA_STAVKA_NALOGA = 21;
    int raschitatZarobotanujuPlatu();
}
