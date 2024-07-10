package edu.ar.data;

import static edu.ar.data.Conexion.close;
import static edu.ar.data.Conexion.getConexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import edu.ar.model.Pelicula;

public class PeliculaDAO {
    private static final String SQL_SELECT = "SELECT * FROM peliculas";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM peliculas WHERE id = ?";
    /* private static final String SQL_SELECT_BY_NAME = "SELECT *"; */
    private static final String SQL_INSERT = "INSERT INTO peliculas (name, description, genre, rate, stars, yearOfRelease) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE peliculas SET name = ?, description = ?, genre = ?, rate = ?, stars = ?, yearOfRelease = ? WHERE id = ?";
    private static final String SQL_DELETE = "DELETE FROM peliculas WHERE id = ?";

    public static List<Pelicula> seleccionar(){
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Pelicula pelicula = null;
        List<Pelicula> peliculas = new ArrayList<>();

        try {
            conn = getConexion();
            ps = conn.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                String genre = rs.getString("genre");
                int rate = rs.getInt("rate");
                int stars = rs.getInt("stars");
                String yearOfRelease = rs.getString("yearOfRelease");

                pelicula = new Pelicula(id, name, description, genre, rate, stars, yearOfRelease);

                peliculas.add(pelicula);
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(rs);
                close(ps);
                close(conn);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }

        return peliculas;
    }

    public static int insertar(Pelicula peli){
        Connection conn = null;
        PreparedStatement ps = null;
        int registros = 0;

        try {
            conn = getConexion();
            ps = conn.prepareStatement(SQL_INSERT);
            ps.setString(1, peli.getName());
            ps.setString(2, peli.getDescription());
            ps.setString(3, peli.getGenre());
            ps.setInt(4, peli.getRate());
            ps.setInt(5, peli.getStars());
            ps.setString(6, peli.getYearOfRelease());

            registros = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally {
            try {
                close(ps);
                close(conn);
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
