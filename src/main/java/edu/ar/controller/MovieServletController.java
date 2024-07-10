package edu.ar.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import edu.ar.data.PeliculaDAO;
import edu.ar.model.Pelicula;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.util.Map;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("/movies")
public class MovieServletController extends HttpServlet {

  static Logger logger = LoggerFactory.getLogger(MovieServletController.class);
  List<Pelicula> movieList = new ArrayList<>();
  ObjectMapper mapper = new ObjectMapper();


  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    String route = req.getParameter("action");
    logger.info("route : " + route);
    switch (route) {
      case "getAll":
        res.setContentType("application/json; charset=UTF-8");
        movieList = PeliculaDAO.seleccionar();
        logger.info("Dentro de getAll : " + movieList.size());
        //transformo en json y lo envio
        mapper.writeValue(res.getWriter(), movieList);
        logger.info(mapper.toString());
        break;
      
      default:
        System.out.println("Parámetro no válido");
    }
  }


  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    //String route = req.getParameter("action");
    
    String route = "add";
    logger.info("Dentro del doPost()");
    logger.info("route : " + route);
    logger.info("req : " + req);
    logger.info("req : " + req.getParameter("name"));
    switch (route) {
      case "add":
          String name = req.getParameter("name");
          String description = req.getParameter("description");
          String genre = req.getParameter("genre");
          int rate = Integer.parseInt(req.getParameter("rate"));
          int stars = Integer.parseInt(req.getParameter("stars"));
          String yearOfRelease = req.getParameter("yearOfRelease");

          logger.info(name, description, genre, rate, stars, yearOfRelease);

          Pelicula newMovie = new Pelicula(name, description, genre, rate, stars, yearOfRelease);
          PeliculaDAO.insertar(newMovie);

          res.setContentType("application/json; charset=UTF-8");
          Map<String, String> response = new HashMap<>();
          response.put("message", "Película guardada exitosamente!!!");
          mapper.writeValue(res.getWriter(), response);
          break;

      default:
          System.out.println("Parámetro no válido");
          break;
      }
  }


}
