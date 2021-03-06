package com.nhnnext.android.miyaeyo.danji.write;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

/**To do
 * 1. Action bar의 취소 버튼 누르면 작성을 종료 하겠냐는 팝업 창 띄우고 확인 누르면 MainActivity로 돌아가고 취소버튼 누르면 작성창 그대로
 * 2. Action bar의 완료버튼 누르면 DB에 저장하고 MainActivity로 돌아옴
 * 3. 카메라 버튼 누르면 카메라를 연결하고 사진을 찍은 후에는 PhotoEditor로 연결
 * 4. 갤러리 버튼 누르면 갤러리를 연결하고 사진을 선택하면 PhotoEditor로 연결
 */
public class WriteParagraphQuotation extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //1. Action bar의 취소버튼 누르면 popup window로 연결(popup window의 확인버튼 -> MainActivity로, 취소버튼 -> 작성중이던 창으로)
        //2. Action bar의 완료버튼 누르면 completeWriting() 연결
        //3. 카메라 버튼 누르면 takePhoto() 연결
        //4. 갤러리 버튼 누르면 selectPhoto() 연결
    }

    @Override
    protected void onStart() {
        super.onStart();
        // 카메라나 갤러리가 불리고 난 후 돌아왔을 때 작성하고 있던 글은 그대로 남아 있어야 한다.
        // PhotoEditor로 편집한 사진을 받아서 No picture칸에 보여줌
    }

    @Override
    protected void onResume() {
        super.onResume();
        // popup window가 떴다가 다시 돌아왔을 때 작성내용 남아 있어야 한다.
    }

    @Override
    protected void onPause() {
        super.onPause();
        //임시저장
    }

    @Override
    protected void onStop() {
        super.onStop();
        //임시저장
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    //Action bar구현부
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

     /*method*/
    // completeWriting(): DB저장하고 MainActivity로 연결
    // storeTemporarily(); 작성내용 임시저장
    // takePhoto(); 카메라 연결하고 사진찍고나면 PhotoEditor호출
    // selectPhoto(); 갤러리 연결하고 사진선택하면 PhotoEditor호출
}
