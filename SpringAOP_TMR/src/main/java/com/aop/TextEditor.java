package com.aop;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

// 01)	
//   private SpellChecker spellChecker;
//
//   @Autowired
//   public void setSpellChecker( SpellChecker spellChecker ){
//      this.spellChecker = spellChecker;
//   }
   
// 02)Autowired on Properties
//	   @Autowired
//	   private SpellChecker spellChecker;
//
//	   public TextEditor() {
//	      System.out.println("Inside TextEditor constructor." );
//	   } 
	
// 03)Autowired on Constructors	
	   
	   private SpellChecker spellChecker;

	   @Autowired
	   public TextEditor(SpellChecker spellChecker){
	      System.out.println("Inside TextEditor constructor." );
	      this.spellChecker = spellChecker;
	   }
	   
//   public SpellChecker getSpellChecker( ) {
//      return spellChecker;
//   }
   public void spellCheck() {
      spellChecker.checkSpelling();
   }

}
