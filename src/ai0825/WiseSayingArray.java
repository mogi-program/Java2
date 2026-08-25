package ai0825;

import java.util.Random;

public class WiseSayingArray {
    public static void main(String[] args) {
        String[] wiseSaying = {"삶이 있는 한 희망은 있다. - 키케로", "언제나 현재에 집중할 수 있다면 행복할 것이다. - 파울로 코엘료", "인생은 자전거를 타는 것과 같다. 균형을 잡으려면 움직여야 하기 때문이다. - 알버트 아인슈타인", "진정으로 웃으려면 고통을 참아야 하며, 나아가 고통을 즐길 줄 알아야 한다. - 찰리 채플린", "피할 수 없으면 즐겨라. - 로버트 엘리엇", "느리게 가는 사람이 가장 멀리 간다.", "지위는 남이 주는 것이지만 평안은 내가 만드는 것이다.", "인생은 공평하지 않다. 그러니 그냥 익숙해져라. - 빌 게이츠", "삶 속에 욕망을 넣어야지, 욕망 속에 삶을 집어넣으면 안 되는 법이다. - 류시화", "창조적인 삶을 살려면 내가 틀릴지도 모른다는 공포를 버려야 한다."};
        Random r = new Random();
        System.out.println(wiseSaying[r.nextInt(wiseSaying.length)]);
    }
}
