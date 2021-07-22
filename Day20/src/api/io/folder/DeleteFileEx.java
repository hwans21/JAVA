package api.io.folder;

import java.io.File;

public class DeleteFileEx {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\hwans\\Develop\\eclipse-workspace\\file_test");
		if(file.exists()) {
			if(file.delete()) {
				System.out.println("파일 삭제 성공!");				
			} // delete 성공 시 true, 실패 시 false를 리턴
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
	}
}
