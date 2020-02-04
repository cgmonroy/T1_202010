package model.logic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import model.data_structures.DoubleLinkedList;
import model.data_structures.IDoubleLinkedList;
import model.data_structures.Node;

public class Modelo {

		//---------
		//ATRIBUTOS
		//---------
		
	/**
	 * 
	 */
	private DoubleLinkedList<Infracciones> listComparendos= new DoubleLinkedList<>();
	
		//-------
		//METODOS
		//-------
	
	/**
	 * 
	 * @return
	 */
	public int darTamano()
	{
		return listComparendos.getSize();
	}

	/**
	 * 
	 * @param comparendosFile
	 */
	public void loadComparendos (String comparendosFile)
	{
		JSONParser parser = new JSONParser();

		try {     
			Object obj = parser.parse(new FileReader(comparendosFile));

			JSONObject jsonObject =  (JSONObject) obj;
			JSONArray jsArray = (JSONArray) jsonObject.get("features");

			for(Object o: jsArray) {

				
				JSONObject comp = (JSONObject) o;	
				JSONObject properties =  (JSONObject) comp.get("properties");
				JSONObject geometry =  (JSONObject) comp.get("geometry");
				JSONArray coordinates = (JSONArray) geometry.get("coordinates");
				Infracciones comparendo = new Infracciones(String.valueOf(comp.get("type")), Integer.parseInt(String.valueOf(properties.get("OBJECTID"))), String.valueOf(properties.get("FECHA_HORA")), String.valueOf(properties.get("CLASE_VEHI")), String.valueOf(properties.get("TIPO_SERVI")), String.valueOf(properties.get("INFRACCION")), String.valueOf(properties.get("DES_INFRAC")), String.valueOf(properties.get("LOCALIDAD")), String.valueOf(geometry.get("type")), String.valueOf(coordinates));
				listComparendos.agregarAlFinal(comparendo);
				System.out.println("Nodos agregados" +listComparendos.getSize());
				System.out.println(comparendo.getOBJECTID());
	
		}
			
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			e.printStackTrace();
		} catch (ParseException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public Infracciones buscarPorObjectId(int OBJECTID)
	{	
		Iterator <Infracciones> iter = listComparendos.iterator();
		Infracciones comp = iter.next();
		Infracciones resp = null;

		while(iter.hasNext()) {
			
			if(comp.getOBJECTID()==OBJECTID)
			{
				resp=comp;
			}
			
			comp = iter.next();	

		}	
		return resp;	
	}
}
