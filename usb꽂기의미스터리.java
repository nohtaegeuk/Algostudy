package 알고리즘swea;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class usb꽂기의미스터리 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		for(int t=1; t<=T; ++t) {
			String[] str = br.readLine().split(" ");
			double p = Double.parseDouble(str[0]);
			double q = Double.parseDouble(str[1]);
			String result = "YES";
			
			double s1 = (1-p)*q;
			double s2 = p*(1-q)*q;
			if(s1 >= s2) {
				result = "NO";
			}
			bw.write("#"+t+" "+result+"\n");
		}
		bw.close();
		br.close();
	}

}
