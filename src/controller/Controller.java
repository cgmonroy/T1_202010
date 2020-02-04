package controller;

import java.io.FileReader;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import model.data_structures.DoubleLinkedList;
import model.logic.Infracciones;
import model.logic.Modelo;
import view.View;

public class Controller {

	//----------
	//CONSTANTES
	//----------

	/**
	 * Ruta del json
	 */
	public static final String rutaJson="./data/commparendosmall.geojson";

	//---------
	//ATRIBUTOS
	//---------

	/**
	 * Lista de infracciones
	 */
	private DoubleLinkedList<Infracciones> lista;

	/**
	 * Atributo de la clase modelo
	 */
	private Modelo modelo;

	/**
	 * Atributo de la clase view
	 */
	private View view;

	/**
	 * Atributo de la clase Infracciones
	 */
	private Infracciones infracciones;

	//-------------
	//CONSTRUCTORES
	//-------------

	/**
	 * Constructor de Controller
	 */
	public Controller()
	{
		lista= new DoubleLinkedList<Infracciones>();
		view = new View();
		modelo = new Modelo();
	}

	//-------
	//METODOS
	//-------

	/**
	 * Metodo para empezar la aplicacion
	 */
	public void run() 
	{
		Scanner scnr = new Scanner(System.in);
		Integer integer = null;
		Object objeto = null;
		String rta = "";
		boolean fin = false;
		while( !fin )
		{
			view.printMenu();

			int x = scnr.nextInt();
			switch(x){
			case 1:
				modelo = new Modelo(); 
				modelo.loadComparendos(rutaJson);					
				break;

			case 2:
				System.out.println("--------- \nDar OBJECTID a buscar: ");
				integer = scnr.nextInt();
				Infracciones comp = modelo.buscarPorObjectId(integer);
				rta = "Type = " + comp.getTYPE() + " " + "/ Localidad = " +comp.getLOCALIDAD() + " " + "/ Infraccion = " +comp.getINFRACCION() + " " + "/ ObjectId = " +comp.getOBJECTID();
				if ( rta != null)
				{
					System.out.println("Infraccion: "+ rta);
				}
				else
				{
					System.out.println("No se encontro la infraccion");
				}
				break;
			default: 
				System.out.println("--------- \n Opcion Invalida !! \n---------");
				break;
			}
		}
	}
}	