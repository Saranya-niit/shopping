package com.niit.services;
import java.io.Serializable; 
import org.springframework.binding.validation.ValidationContext;
 import javax.servlet.http.HttpServletRequest; 
 import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
 import org.springframework.validation.BindingResult;
import org.springframework.webflow.execution.RequestContext;

import com.niit.dao.CardDetailDAO; 
import com.niit.model.CardDetail; 
import com.niit.myException.QtyNotAvaiable; 
 
 
 @Service 
 public class CardDetailService implements Serializable { 
 	@Autowired 
    private CardDetailDAO cardDetailDao; 

 
     public String addCardDetail (CardDetail cardDetail,RequestContext context) { 
     	try{ 
     	 
     	HttpServletRequest request = (HttpServletRequest )context.getExternalContext().getNativeRequest();   
    	 
    	cardDetailDao.addCardDetail(cardDetail, request.getUserPrincipal()); 
    	 
    	 
    	return "success";} 
    	catch (Exception m)  { 
    		m.printStackTrace(); 
			return "qtyerror"; 
 		} 
   } 
} 


