# Youtube

#### 영상 리스트를 보여주고 영상을 재생하는 유튜브의 간단한 기능을 구현한 안드로이드 앱 입니다.
### Blog
* <https://hwayomingdlog.tistory.com/285>
* <https://hwayomingdlog.tistory.com/286>
* <https://hwayomingdlog.tistory.com/287>
* <https://hwayomingdlog.tistory.com/288>
* <https://hwayomingdlog.tistory.com/289>
</br>

## 주기능
### 홈 화면
* 영상 리스트를 RecyclerView에 표시합니다.
* 유튜브처럼 화면 하단에 재생된 영상을 미리보기 할 수 있으며, 재생/일시정지 버튼을 눌러 영상을 재생하거나 일시정지 할 수 있습니다.
* 영상을 클릭하면 화면 하단의 작은 미리보기 화면이 커지며 영상을 감상할 수 있습니다.
</br>

## 활용 기술
* MotionLayout - 홈 화면 하단에 영상 미리보기를 지원하는 PlayView와 플레이어 컨트롤 버튼을 가지는 레이아웃을 MotionLayout의 start 상태로 정의하였습니다. </br>
start 상태에서 사용자가 영상을 클릭하거나 MotionLayout을 위로 스와이프하면, end 상태로 바뀌어 PlayView의 width를 화면 크기에 맞춰 키우고 컨트롤 버튼을 숨기며, 영상 리스트를 보여주는 RecyclerView를 하단에 표시하도록 레이아웃을 정의하였습니다.
* Fragment - MotionLayout을 화면에 표시하는 Fragment를 정의하여 홈 화면의 FrameLayout에 적용하였습니다.
* Retrofit2 - 영상 리스트를 가지는 mocking data가 담긴 URL로부터 데이터를 가져오기 위해 사용하였습니다.
* ExoPlayer2 - 동영상을 재생하고 일시정지하기 위해 사용하였습니다.
* RecyclerView - ListAdapter를 사용하여 DiffUtil을 적용해 영상 리스트를 보여주는 RecyclerView를 구현했습니다.
</br>

***
<img src="/img/img0.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img1.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img2.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img3.png" width="300px" height="600px" title="" alt=""></img>
<img src="/img/img4.png" width="300px" height="600px" title="" alt=""></img>
