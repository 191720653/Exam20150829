package com.hand.Exam20150829;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dao.IFilmDao;
import com.hand.entity.Film;
import com.hand.entity.Language;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    	
//    	System.out.println("Context Strat");
    	context.start();
    	Film film = new Film();IFilmDao iFilmDao = (IFilmDao) context.getBean("filmDao");
    	List<Language> list = iFilmDao.queryLanguage();
    	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	System.out.println("请输入电影标题:");
    	film.setTitle(scanner.nextLine());
    	System.out.println("请输入电影语言的id：");
    	for(int i=0;i<list.size();i++){
    		System.out.println("Id: "+list.get(i).getLanguageId() +" 语言： " +list.get(i).getName());
    	}
    	film.setLanguageId(scanner.nextInt());
    	System.out.println("请输入电影出租天数：");
    	film.setRentalDuration(scanner.nextShort());
    	System.out.println("请输入电影租金：");
    	film.setRentalRate(scanner.nextDouble());
    	System.out.println("请输入电影损坏赔款：");
    	film.setReplacementCost(scanner.nextDouble());
    	
    	System.out.println("input data: " + film.toString());
    	
    	iFilmDao.addFilm(film);
    	
    	context.stop();
//    	System.out.println("Context End");
    }
}
