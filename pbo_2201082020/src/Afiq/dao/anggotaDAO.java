/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Afiq.dao;
import Afiq.model.anggota;
import java.util.List;
/**
 *
 * @author HP
 */
public interface anggotaDAO {
    void insert(anggota Anggota);
    void update(int index, anggota Anggota);
    void delete(int index);
    anggota getAnggota(int index);
    List<anggota>getAll();
}
