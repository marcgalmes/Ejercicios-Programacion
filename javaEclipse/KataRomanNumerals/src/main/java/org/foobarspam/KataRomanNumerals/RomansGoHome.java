package org.foobarspam.KataRomanNumerals;

import static org.assertj.core.api.Assertions.assertThat;

import org.eclipse.e4.core.contexts.*;
import org.eclipse.e4.core.di.InjectorFactory;
import org.foobarspam.KataRomanNumerals.NumeroRomano;
import org.foobarspam.KataRomanNumerals.RegexNumerosRomanos;

public class RomansGoHome {

	public static void main(String[] args) {
		
    	// Doc: http://www.regular-expressions.info/lookaround.html
		
        String test = "MDCCCLXXXVIII"; // 1888
        test = "MMDCCLXXVII";
        test = "CDXLIV"; // 444
        test = "CDXXXIX"; // 439
        
        RegexNumerosRomanos arrayRegex = new RegexNumerosRomanos();  
        
		NumeroRomano sample = new NumeroRomano(test, arrayRegex);
		
		sample.initArrayRegex();
		
		sample.toDecimal();
		
		assertThat(sample.getNumeroDecimal()).isEqualTo((short) 439);
		
		System.out.println(sample.getNumeroRomano() + " = " + sample.getNumeroDecimal());

	}
}
