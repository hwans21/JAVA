package regex.pattern;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegexQuiz03 {

	public static void main(String[] args) {
		/*
		 * 1. day, store, grade,detail,price를 멤버로 갖는 Product 클래스를 선언합니다.
		 * 
		 * 2. 은닉을 이용해서 클래스를 디자인합니다.
		 * 
		 * 3. MainClass에 Product 타입을 갖는 ArrayList를 생성합니다.
		 * 
		 * 4. BufferedReader를 통해서 건담.txt파일을 읽어들이세요 (인코딩 방식 -> UTF-8)
		 * 
		 * 5. while문 안에서는 readLine()메서드를 이용해서 한 줄씩 읽도록 처리합니다.
		 * 
		 * 
		 * 
		 * 6. 날짜, 지점, 등급, 상세, 가격 패턴 분석을 통해서 Product에 저장후 리스트에 추가합니다. 상세 같은 경우에는 정규 표현식
		 * 패턴으로 구분하기 어려울 수 있기 때문에 등급패턴의 끝지점~ 가격패턴의 시작지점미만까지 부분추출하시는 것을
		 * 추천드립니다.(substring(begin,end))
		 * 
		 * 7. 외부 라이브러리를 사용해서 분석한 패턴을 xlsx엑셀 파일로 추출하시면 됩니다. 엑셀파일객체 생성 후에
		 * FileOutputStream을 사용하여 파일을 작성하시면 됩니다. (확장자는 xlsx)
		 * 
		 */

		List<Product> list = new ArrayList<Product>();

		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(new FileInputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\file\\건담.txt"), "UTF-8"));

			// 패턴 저장할 변수
			String pDay = "\\d{8}-\\d{2}-\\d+";
			String pStore = "[가-힣]+ [가-힣]+";
			String pGrade = "\\[[A-Z가-힣]*\\]";
			String pPrice = "\\d+,*\\d+원";

			String str;
			while ((str = br.readLine()) != null) {
//				System.out.println(str);
				Matcher day = Pattern.compile(pDay).matcher(str);
				Matcher store = Pattern.compile(pStore).matcher(str);
				Matcher grade = Pattern.compile(pGrade).matcher(str);
				Matcher price = Pattern.compile(pPrice).matcher(str);
				if (day.find() && store.find() && grade.find() && price.find()) {
					String detail = str.substring(grade.end() + 1, price.start() - 1);
					list.add(new Product(day.group(), store.group(), grade.group(), detail, price.group()));

				}
			}
//			list.stream().forEach((data) ->{
//				System.out.println("----------------");
//				System.out.println(data.getDay());
//				System.out.println(data.getStore());
//				System.out.println(data.getGrade());
//				System.out.println(data.getDetail());
//				System.out.println(data.getPrice());
//			});

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		excel(list); // 엑셀 메서드를 호출해서 엑셀파일 생성

//		XSSFWorkbook wb = new  XSSFWorkbook();
//		XSSFSheet sheet = wb.createSheet("건담");
//		XSSFRow row = null;
//		XSSFCell cell = null;
//
//		
//		
//		for(int i=0; i<list.size();i++) {
//			List<String> slist = new ArrayList<String>();
//			slist.add(list.get(i).getDay());
//			slist.add(list.get(i).getStore());
//			slist.add(list.get(i).getGrade());
//			slist.add(list.get(i).getDetail());
//			slist.add(list.get(i).getPrice());
//			row = sheet.createRow(i);
//			for(int j=0;j<slist.size();j++) {
//				cell=row.createCell(j);
//				cell.setCellValue(slist.get(j));
//			}
//		}
//		FileOutputStream fos = null;
//		try {
//			fos = new FileOutputStream("J:\\eclipse-workspace\\file\\건담.xlsx");
//			wb.write(fos);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			try {
//				wb.close();
//				fos.close();
//			} catch (Exception e2) {
//				// TODO: handle exception
//			}
//		}

		// 엑셀 출력 메서드

	}

	public static void excel(List<Product> list) {
		/*
		 * hssf : 2007이전 xssf : 2008이후 sxssf : 2008이후 -> 대용량
		 */
		// 워크북 생성
		XSSFWorkbook wb = new XSSFWorkbook();

		// 워크시트 생성
		XSSFSheet sheet = wb.createSheet("건담");

		// 행 생성
		XSSFRow row = sheet.createRow(0);

		// 셀 생성
		XSSFCell cell;

		// 헤더 정보 구성.
		cell = row.createCell(0);
		cell.setCellValue("날짜");

		cell = row.createCell(1);
		cell.setCellValue("지점");

		cell = row.createCell(2);
		cell.setCellValue("등급");

		cell = row.createCell(3);
		cell.setCellValue("상세");

		cell = row.createCell(4);
		cell.setCellValue("가격");

		// 리스트의 size만큼 row를 생성
		Product vo;
		for (int i = 0; i < list.size(); i++) {
			vo = list.get(i);

			// 행 생성
			row = sheet.createRow(i + 1);
			cell = row.createCell(0);
			cell.setCellValue(vo.getDay());

			cell = row.createCell(1);
			cell.setCellValue(vo.getStore());

			cell = row.createCell(2);
			cell.setCellValue(vo.getGrade());

			cell = row.createCell(3);
			cell.setCellValue(vo.getDetail());

			cell = row.createCell(4);
			cell.setCellValue(vo.getPrice());
		}
		
		//파일 쓰기
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\Users\\hwans\\Develop\\eclipse-workspace\\file\\건담.xlsx");
			wb.write(fos);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
