package com.example.spring_server.dto;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Music {

	private int id;
	private String singer; 
	private String title;
	private String albumTitle;
	private String audioUrl;
	private String imageUrl;
	private String lyrics;

	
	public static ArrayList<Music> sampledata() {
		ArrayList<Music> list = new ArrayList<>();
		list.add(new Music(1, "싸이", "That That", "싸다9",
				"https://drive.google.com/uc?export=download&id=126WvXJzZWz087BQWC3GH9k1DYYcLbpAS",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/37/474/10937474_20220428225312_500.jpg?cbc115ca0a2db2fed082e94f5862e8bd/melon/resize/282/quality/80/optimize",
				"20 22\r\n" + "PSY Coming back (이리 오너라)\r\n" + "\r\n" + "Long time no see huh?\r\n" + "오래간만이지 huh?\r\n"
						+ "우리 다시 웃고 울고 지지고 볶고\r\n" + "Let’s get loco\r\n" + "\r\n" + "Pandemic's over uh\r\n"
						+ "그래 기분이 오져 uh\r\n" + "다시 그분이 오죠 uh\r\n" + "Everybody say\r\n" + "\r\n" + "뻑적지근해\r\n"
						+ "걸쩍지근해\r\n" + "시끌벅적거리네\r\n" + "너무 좋아 북적거리네\r\n" + "동서남북 Aye\r\n" + "강남강북 Aye\r\n"
						+ "싹 다 모여 Throw yo hands in the air\r\n" + "I say yeah\r\n" + "\r\n" + "Can you feel it?\r\n"
						+ "Can you feel it?\r\n" + "Oh oh woo yeah Oh woo oh\r\n" + "\r\n" + "Can you feel it?\r\n"
						+ "Can you feel it?\r\n" + "Oh oh woo yeah Ah\r\n" + "\r\n" + "준비하시고 (Go) 쏘세요 (Oh)\r\n"
						+ "That that I like that (Like that)\r\n" + "기분 좋아 Babe (Babe)\r\n"
						+ "흔들어 좌 우 위 아래로 (Sing it)\r\n" + "One two three to the four (Sing it)\r\n" + "\r\n"
						+ "That that I like that\r\n" + "That that I like that babe\r\n" + "That that I like that\r\n"
						+ "It’s like that that yo\r\n" + "\r\n" + "That that I like that\r\n"
						+ "That that I like that babe\r\n" + "That that I like that\r\n" + "It’s like that\r\n" + "\r\n"
						+ "야 내가 뭐 하는 사람인지 까먹었지?\r\n" + "That that I like that (Like that)\r\n" + "시간이 지나도 변함없이\r\n"
						+ "That that I like that (Like that)\r\n" + "I don't care I don't care that I like that\r\n"
						+ "That that I like that (Like that)\r\n" + "내가 바라보고 바라왔던 사람들아\r\n" + "모두 다 Ready set go\r\n"
						+ "되려 늘어난 맷집 때리던 분이 불편하겠지\r\n" + "너네 바람대로 망할 거라 고사 지낸\r\n" + "사람들을 모아다가 가볍게 때찌\r\n"
						+ "적당히 하라고 Oh oh oh\r\n" + "그냥 닥치고 다 같이 놀아보자고 Oh oh oh\r\n" + "민윤기와 박재상\r\n" + "\r\n"
						+ "Can you feel it?\r\n" + "Can you feel it?\r\n" + "Oh oh woo yeah Oh woo oh\r\n" + "\r\n"
						+ "Can you feel it?\r\n" + "Can you feel it?\r\n" + "Oh oh woo yeah Ah\r\n" + "\r\n"
						+ "준비하시고 (Go) 쏘세요 (Oh)\r\n" + "That that I like that (Like that)\r\n" + "기분 좋아 Babe (Babe)\r\n"
						+ "흔들어 좌 우 위 아래로 (Sing it)\r\n" + "One two three to the four (Sing it)\r\n" + "\r\n"
						+ "That that I like that\r\n" + "That that I like that babe\r\n" + "That that I like that\r\n"
						+ "It’s like that that yo\r\n" + "\r\n" + "That that I like that\r\n"
						+ "That that I like that babe\r\n" + "That that I like that\r\n" + "It’s like that that yo\r\n"
						+ "\r\n" + "Do what you wanna\r\n" + "Say what you wanna\r\n"
						+ "Do what you wanna (Say what?)\r\n" + "That that I like that babe\r\n" + "\r\n"
						+ "Do what you wanna\r\n" + "Say what you wanna\r\n" + "Do what you wanna (Say what?)\r\n"
						+ "That that I like that babe\r\n" + "That that I like that"));

		list.add(new Music(2, "(여자)아이들", "TOMBOY", "I NEVER DIE",
				"https://drive.google.com/uc?export=download&id=1nPr6gkCJaotGRPcCZGzFeXFjXjALCWdX",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/90/384/10890384_20220314111504_500.jpg?4b9dba7aeba43a4e0042eedb6b9865c1/melon/resize/282/quality/80/optimize",
				"Look at you 넌 못 감당해 날\r\n" + "Ya took off hook\r\n" + "기분은 Coke like brrr\r\n"
						+ "Look at my toe 나의 Ex 이름 Tattoo\r\n" + "I got to drink up now 네가 싫다 해도 좋아\r\n" + "\r\n"
						+ "Why are you cranky, boy?\r\n" + "뭘 그리 찡그려 너\r\n" + "Do you want a blond barbie doll?\r\n"
						+ "It’s not here, I’m not a doll\r\n" + "\r\n" + "미친 연이라 말해 What’s the loss to me ya\r\n"
						+ "사정없이 까보라고 You’ll lose to me ya\r\n" + "사랑 그깟 거 따위 내 몸에 상처 하나도 어림없지\r\n"
						+ "너의 썩은 내 나는 향수나 뿌릴 바엔\r\n" + "\r\n" + "Ye I’m a Tomboy (Umm ah umm)\r\n"
						+ "Ye I’ll be the Tomboy (Umm ah)\r\n" + "This is my attitude\r\n" + "Ye I’ll be the Tomboy\r\n"
						+ "\r\n" + "I don’t wanna play this ping pong\r\n" + "I would rather film a Tik Tok\r\n"
						+ "Your mom raised you as a prince\r\n" + "But this is queendom, right?\r\n"
						+ "I like dancing, I love ma friends\r\n" + "Sometimes we swear without cigarettes\r\n"
						+ "I like to eh on drinking whiskey\r\n" + "I won’t change it, what the hell?\r\n" + "\r\n"
						+ "미친 척이라 말해 What’s the loss to me ya\r\n" + "사정없이 씹으라고 You’re lost to me ya\r\n"
						+ "사랑 그깟 거 따위 내 눈에 눈물 한 방울 어림없지\r\n" + "너의 하찮은 말에 미소나 지을 바엔\r\n" + "\r\n"
						+ "Ye I’m a Tomboy (Umm ah umm)\r\n" + "Ye I’ll be the Tomboy (Umm ah)\r\n"
						+ "This is my attitude\r\n" + "Ye I’ll be the Tomboy\r\n" + "\r\n" + "Said you get it?\r\n"
						+ "You get the song right, you’ll get what I mean “Tomboy”"));

		list.add(new Music(3, "IVE (아이브)", "LOVE DIVE", "LOVE DIVE", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/09/179/10909179_20220405103521_500.jpg?f1db0eeac1f61dd8a9c7696bdb50aea8/melon/resize/282/quality/80/optimize",
				"네가 참 궁금해 그건 너도 마찬가지\r\n" + "이거면 충분해 쫓고 쫓는 이런 놀이\r\n" + "참을 수 없는 이끌림과 호기심\r\n" + "묘한 너와 나 두고 보면 알겠지\r\n"
						+ "\r\n" + "Woo 눈동자 아래로\r\n" + "Woo 감추고 있는 거\r\n" + "Woo yeah It’s so bad It’s good\r\n"
						+ "난 그 맘을 좀 봐야겠어\r\n" + "\r\n" + "Narcissistic, my god I love it\r\n" + "서로를 비춘 밤\r\n"
						+ "아름다운 까만 눈빛 더 빠져 깊이\r\n" + "(넌 내게로 난 네게로)\r\n" + "숨 참고 love dive\r\n" + "\r\n"
						+ "Woo lalalalalalala\r\n" + "Woo 어서 와서 love dive\r\n" + "Woo oh perfect sacrifice yeah\r\n"
						+ "숨 참고 love dive\r\n" + "\r\n" + "마음은 이렇게 알다가도 모르지\r\n" + "사랑이라는 건 한순간에 필 테니\r\n"
						+ "직접 들어와 두 눈으로 확인해\r\n" + "내 맘 가장 깊은 데로 오면 돼\r\n" + "\r\n" + "Woo 망설일 시간은\r\n"
						+ "Woo 3초면 되는 걸\r\n" + "Woo yeah It’s so bad It’s good\r\n" + "원하면 감히 뛰어들어\r\n" + "\r\n"
						+ "Narcissistic, my god I love it\r\n" + "서로를 비춘 밤\r\n" + "아름다운 까만 눈빛 더 빠져 깊이\r\n"
						+ "(넌 내게로 난 네게로)\r\n" + "숨 참고 love dive\r\n" + "\r\n" + "Woo lalalalalalala\r\n"
						+ "Woo 어서 와서 love dive\r\n" + "Woo oh perfect sacrifice yeah\r\n" + "숨 참고 love dive\r\n" + ""));

		list.add(new Music(4, "멜로망스", "사랑인가 봐", "사랑인가 봐(사내 맞선 OST)",
				"https://drive.google.com/uc?export=download&id=13bf5EBwR7vJUkkDrn3086_ye-tS8Or44",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/71/162/10871162_20220217162422_500.jpg?d77ecb572464fd179c5e963a6fe0a351/melon/resize/282/quality/80/optimize",
				"너와 함께 하고 싶은 일들을\r\n" + "상상하는 게\r\n" + "요즘 내 일상이 되고\r\n" + "너의 즐거워하는 모습을 보고 있으면\r\n"
						+ "자연스레 따라 웃고 있는 걸\r\n" + "너의 행동에 설레어하고 뒤척이다가\r\n" + "지새운 밤이 많아지는데\r\n" + "이건 누가 봐도 사랑일 텐데\r\n"
						+ "종일 함께면 질릴 텐데\r\n" + "나 돌아서도 온통 너인 건\r\n" + "아무래도 사랑인가 봐\r\n" + "점점 너와 하고 싶은 일들 생각하면서\r\n"
						+ "하룰 보낸 날이 많아지는데\r\n" + "이건 누가 봐도 사랑일 텐데\r\n" + "종일 함께면 질릴 텐데\r\n" + "나 돌아서도 온통 너인 건\r\n"
						+ "아무래도 사랑인가 봐\r\n" + "너의 행복해하는 모습을 보고 있으면\r\n" + "나도 모르게 따라 웃는데\r\n" + "이 정도면 알아줄 만하잖아\r\n"
						+ "너도 용기 낼만 하잖아\r\n" + "나만 이런 게 아니라면\r\n" + "우리 만나볼 만하잖아\r\n" + "아무래도 사랑인가 봐"));

		list.add(new Music(5, "BIGBANG (빅뱅)", "봄여름가을겨울 (Still Life)", "봄여름가을겨울 (Still Life)",
				"https://drive.google.com/uc?export=download&id=16p9ifWE_I_IoN1MaUeBJQJymonAZYeQm",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/08/834/10908834_20220404174407_500.jpg?3b0d20a04b395a89bdade1b70a5dd46d/melon/resize/282/quality/80/optimize",
				"이듬해 질 녘 꽃 피는 봄 한여름 밤의 꿈\r\n" + "가을 타 겨울 내릴 눈 1년 네 번 또다시 봄\r\n" + "\r\n" + "정들었던 내 젊은 날 이제는 안녕\r\n"
						+ "아름답던 우리의 봄 여름 가을 겨울\r\n" + "\r\n" + "“Four seasons with no reason.”\r\n"
						+ "비 갠 뒤에 비애(悲哀) 대신 a happy end\r\n" + "비스듬히 씩 비웃듯 칠색 무늬의 무지개\r\n"
						+ "철없이 철 지나 철들지 못해(still)\r\n" + "철부지에 철 그른지 오래, Marchin’ 비발디\r\n" + "차이코프스키, 오늘의 사계를 맞이해\r\n"
						+ "마침내, 마치 넷이 못내\r\n" + "\r\n" + "Boy 저 하늘만 바라보고서\r\n" + "사계절 잘 지내고 있어 Good-bye\r\n"
						+ "떠난 사람 또 나타난 사람\r\n" + "머리 위 저세상\r\n" + "난 떠나 영감의 amazon\r\n" + "지난 밤의 트라우마 다 묻고\r\n"
						+ "목숨 바쳐 달려올 새 출발 하는 왕복선\r\n" + "변할래 전보다는 더욱더\r\n" + "좋은 사람 더욱더\r\n" + "더 나은 사람 더욱더\r\n"
						+ "아침 이슬을 맞고 내 안에 분노 과거에 묻고\r\n" + "For Life\r\n" + "\r\n" + "울었던 웃었던 소년과 소녀가 그리워 나\r\n"
						+ "찬란했던 사랑했던 그 시절만 자꾸 기억나\r\n" + "\r\n" + "계절은 날이 갈수록 속절없이 흘러\r\n"
						+ "붉게 물들이고 파랗게 멍들어 가슴을 훑고\r\n" + "\r\n" + "언젠가 다시 올 그날 그때를 위하여 (그대를 위하여)\r\n"
						+ "아름다울 우리의 봄 여름 가을 겨울\r\n" + "\r\n" + "La la la la la la la la la la la\r\n"
						+ "La la la la la la la la la la la\r\n" + "La la la la la la la la la la la\r\n"
						+ "La la la la la la la la la la la\r\n" + "\r\n" + "이듬해 질 녘 꽃 피는 봄 한여름 밤의 꿈\r\n"
						+ "가을 타 겨울 내린 눈 봄 여름 가을 겨울"));

		list.add(new Music(6, "임영웅", "사랑은 늘 도망가", "신사와 아가씨 OST Part.2",
				"https://drive.google.com/uc?export=download&id=179zVwgyPfy2ABgj0qPJhKW3Yf6mxhB6q",
				"https://cdnimg.melon.co.kr/cm2/album/images/107/35/654/10735654_20211008114339_500.jpg?7eeae0e5c1f24c5ae9fa04f626e74c34/melon/resize/282/quality/80/optimize",
				"눈물이 난다 이 길을 걸으면\r\n" + "그 사람 손길이 자꾸 생각이 난다\r\n" + "붙잡지 못하고 가슴만 떨었지\r\n" + "내 아름답던 사람아\r\n"
						+ "사랑이란 게 참 쓰린 거더라\r\n" + "잡으려 할수록 더 멀어지더라\r\n" + "이별이란 게 참 쉬운 거더라\r\n" + "내 잊지 못할 사람아\r\n"
						+ "사랑아 왜 도망가\r\n" + "수줍은 아이처럼\r\n" + "행여 놓아버릴까 봐\r\n" + "꼭 움켜쥐지만\r\n" + "그리움이 쫓아 사랑은 늘 도망가\r\n"
						+ "잠시 쉬어가면 좋을 텐데\r\n" + "바람이 분다 옷깃을 세워도\r\n" + "차가운 이별의 눈물이 차올라\r\n" + "잊지 못해서 가슴에 사무친\r\n"
						+ "내 소중했던 사람아\r\n" + "사랑아 왜 도망가\r\n" + "수줍은 아이처럼\r\n" + "행여 놓아버릴까 봐\r\n" + "꼭 움켜쥐지만\r\n"
						+ "그리움이 쫓아 사랑은 늘 도망가\r\n" + "잠시 쉬어가면 좋을 텐데\r\n" + "기다림도 애태움도 다 버려야 하는데\r\n"
						+ "무얼 찾아 이 길을 서성일까\r\n" + "무얼 찾아 여기 있나\r\n" + "사랑아 왜 도망가\r\n" + "수줍은 아이처럼\r\n"
						+ "행여 놓아버릴까 봐\r\n" + "꼭 움켜쥐지만\r\n" + "그리움이 쫓아 사랑은 늘 도망가\r\n" + "잠시 쉬어가면 좋을 텐데\r\n"
						+ "잠시 쉬어가면 좋을 텐데"));

		list.add(new Music(7, "BIG Naughty (서동현)", "정이라고 하자 (Feat. 10CM)", "정이라고 하자",
				"https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/25/762/10925762_20220419152007_500.jpg?e4fe0e576690ff4b3823d6d2baa4c2fe/melon/resize/282/quality/80/optimize",
				"Back to the day\r\n" + "갓 10대가 됐을 때\r\n" + "그때 내가 널 보지 못했다면\r\n" + "어땠을까 해\r\n"
						+ "왜인지 외로워지는 밤에 You say\r\n" + "흐린 추억 속에 네게 안겨 잠드네\r\n" + "Yeah 친구들과의 술자리\r\n"
						+ "나는 또 네 얘기를 꺼내\r\n" + "보고 싶다는 넋두리에\r\n" + "친구들 답은 뻔해\r\n" + "10년도 더 된 애를 사랑할 수 있냬\r\n"
						+ "이제 그만 잊으래\r\n" + "근데 그게 잘 안돼\r\n" + "그래 걔 말마따나\r\n" + "넌 아담의 사과일 수도\r\n"
						+ "But 난 신을 안 믿으니까\r\n" + "네 전화 바로 픽업\r\n" + "지금 주소 찍어\r\n" + "어디든 상관없어 다 갈 테니까\r\n"
						+ "그건 사랑이 아냐\r\n" + "그건 미련이 아냐\r\n" + "그냥 정이라고 하자\r\n" + "임마 네가 뭘 알아\r\n" + "이건 사랑이 맞아\r\n"
						+ "분명 약속했단 말이야\r\n" + "I know I’m wrong\r\n" + "그 자리에 그대로\r\n" + "두고 온 기억들을\r\n"
						+ "더듬고 있을 때면"));

		list.add(new Music(8, "임영웅", "우리들의 블루스", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"잊지는 말아요 함께 했던 날들\r\n" + "눈물이 날 때면\r\n" + "그대 뒤를 돌아보면 돼요\r\n" + "아프지 말아요 쓸쓸한 마음에\r\n"
						+ "힘든 일이 참 많았죠 그대에겐\r\n" + "내가 곁에 있을게요\r\n" + "그댈 위해 노래할게요\r\n" + "잊지 말아요\r\n"
						+ "그댈 위해 약속할게요\r\n" + "언젠가 우리 시간 지나면\r\n" + "알게 되겠죠\r\n" + "그땐 웃을 수 있죠 나 약속할게요\r\n"
						+ "그땐 미소 짓겠죠\r\n" + "작은 행복까지 모두\r\n" + "외롭고 지칠 때 손잡아 줄게요\r\n" + "슬픔이 짙어질 때면 위로해 줄\r\n"
						+ "그 한 사람이 될게요\r\n" + "그대 부디 울지 말아요\r\n" + "슬퍼 말아요\r\n" + "그대에게 빛이 될게요\r\n"
						+ "언젠가 우리 시간 지나면\r\n" + "알게 되겠죠\r\n" + "그땐 웃을 수 있죠 나 약속할게요\r\n" + "폭풍 속에 혼자 남아 헤매도 오\r\n"
						+ "길이 되어 지킬게요 그대\r\n" + "그댈 위해 노래할게요\r\n" + "잊지 말아요\r\n" + "그댈 위해 약속할게요\r\n"
						+ "어두운 길을 밝게 비추는\r\n" + "그대의 빛이 될게요"));

		list.add(new Music(9, "경서", "나의 X에게", "나의 X에게",
				"https://drive.google.com/uc?export=download&id=1xkx5kmf5xJZ6H2maHBu2x4-MF7My_o85",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/29/486/10929486_20220422151852_500.jpg?648f2d70a3d877844192313f323bf7bb/melon/resize/282/quality/80/optimize",
				"우리 다시 만날래\r\n" + "예쁘게 빛나던\r\n" + "모든 추억들이\r\n" + "너무 그리워\r\n" + "너의 품에 안길래\r\n" + "이 밤이 새도록\r\n"
						+ "네게 말할 거야\r\n" + "너를 좋아한다고\r\n" + "안녕 그대야\r\n" + "요즘 어떻게 지내\r\n" + "가로수길 걷다가\r\n"
						+ "생각이 나서\r\n" + "행복해 보이는 사람들 속에\r\n" + "우리 둘만 없어서\r\n" + "어색했었어\r\n" + "늘 집에 갈 땐\r\n"
						+ "항상 뒤돌아보면\r\n" + "날 보며 웃어주던\r\n" + "네가 생각났어\r\n" + "우리 다시 만날래\r\n" + "예쁘게 빛나던\r\n"
						+ "모든 추억들이\r\n" + "너무 그리워\r\n" + "너의 품에 안길래\r\n" + "이 밤이 새도록\r\n" + "네게 말할 거야\r\n"
						+ "너를 좋아한다고\r\n" + "토요일마다 가던\r\n" + "한강공원에\r\n" + "이어폰 하나씩\r\n" + "나눠끼고서\r\n"
						+ "벚꽃엔딩같이 듣고 있으면\r\n" + "부러울 게 없었어\r\n" + "너만 있으면\r\n" + "널 사랑할 때\r\n" + "내가 너무 그리워\r\n"
						+ "날 보며 웃어주던\r\n" + "네가 보고 싶어\r\n" + "우리 다시 만날래\r\n" + "예쁘게 빛나던\r\n" + "모든 추억들이\r\n"
						+ "너무 그리워\r\n" + "너의 품에 안길래\r\n" + "이 밤이 새도록\r\n" + "네게 말할 거야\r\n" + "너를 좋아한다고\r\n"
						+ "같이 별 보러 갈래\r\n" + "널 다시 만나면\r\n" + "네 옆에 기대서\r\n" + "잠들고 싶어\r\n" + "너의 품에 안길래\r\n"
						+ "이 밤이 새도록\r\n" + "내 곁에 있어줘\r\n" + "내겐 너뿐이라고"));

		list.add(new Music(10, "LE SSERAFIM (르세라핌)", "FEARLESS", "FEARLESS", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/39/458/10939458_20220502123814_500.jpg?86d6e58174ad3b107f20ccfe00658b1f/melon/resize/282/quality/80/optimize",
				"Bam ba ba ba ba bam ba ba ba ba bam\r\n" + "Ba ba ba ba bam\r\n"
						+ "Bam ba ba ba ba bam ba ba ba ba bam\r\n" + "Ba ba ba ba bam\r\n" + "\r\n"
						+ "제일 높은 곳에 난 닿길 원해 느꼈어 내 answer\r\n" + "내 혈관 속에 날뛰는 new wave 내 거대한 passion\r\n"
						+ "관심 없어 과거에 모두가 알고 있는 그 트러블에 huh\r\n" + "I'm fearless a new b**ch new crazy 올라가 next one\r\n"
						+ "\r\n" + "밟아줘 highway highway\r\n" + "멋진 결말에 닿게\r\n" + "내 흉짐도 나의 일부라면\r\n" + "겁이 난 없지 없지\r\n"
						+ "\r\n" + "What you lookin’ at\r\n" + "What you what you lookin’ at\r\n"
						+ "What you lookin’ at\r\n" + "What you what you lookin’ at\r\n" + "What you lookin’ at\r\n"
						+ "What you what you lookin’ at\r\n" + "Mmmm I’m fearless huh\r\n" + "\r\n"
						+ "You should get away\r\n" + "Get a get a get away\r\n" + "다치지 않게 다치 다치지 않게\r\n"
						+ "You should get away\r\n" + "Get a get a get away\r\n" + "Mmmm I’m fearless huh\r\n" + "\r\n"
						+ "Bam ba ba ba ba bam ba ba ba ba bam\r\n" + "Ba ba ba ba bam\r\n"
						+ "Bam ba ba ba ba bam ba ba ba ba bam\r\n" + "Ba ba ba ba bam\r\n" + "\r\n"
						+ "욕심을 숨기라는 네 말들은 이상해\r\n" + "겸손한 연기 같은 건 더 이상 안 해\r\n" + "가져와 forever win 내게 ay\r\n"
						+ "가슴팍에 숫자 1 내게 ay\r\n" + "내 밑으로 조아린 세계 ay\r\n"
						+ "Take the world break it down break you down down\r\n" + "\r\n" + "밟아줘 highway highway\r\n"
						+ "멋진 결말에 닿게\r\n" + "내 흉짐도 나의 일부라면\r\n" + "겁이 난 없지 없지\r\n" + ""));

		list.add(new Music(11, "임영웅", "다시 만날 수 있을까", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"너를 위해 해 줄 것이 하나 없어서\r\n" + "보낼 수밖에 없었고\r\n" + "네가 없이 사는 법을 알지 못해서\r\n" + "순간순간을 울었다\r\n"
						+ "후회로 가득한 한숨 자락이\r\n" + "시린 바람처럼\r\n" + "가슴 치는 날 그 언젠가\r\n" + "우리 만날 수 있을까\r\n"
						+ "다시 만날 수 있을까\r\n" + "그리 좋던 예전처럼 그때처럼\r\n" + "되돌아갈 수 있을까\r\n" + "다시 우리가 만나면\r\n"
						+ "무엇을 해야만 할까\r\n" + "서로를 품에 안고서\r\n" + "하염없이 눈물만 흘려볼까\r\n" + "붙잡을 마음이야 없었겠냐마는\r\n"
						+ "그때 난 부끄러웠다\r\n" + "떳떳하게 일어나 널 다시 찾아갈\r\n" + "뜨거운 꿈만 꾸었다\r\n" + "둘이 함께 했던 순간순간이\r\n"
						+ "시린 폭포처럼\r\n" + "쏟아지는 날 그 언젠가\r\n" + "우리 만날 수 있을까\r\n" + "다시 만날 수 있을까\r\n"
						+ "그리 좋던 예전처럼 그때처럼\r\n" + "되돌아갈 수 있을까\r\n" + "다시 우리가 만나면\r\n" + "무엇을 해야만 할까\r\n"
						+ "서로를 품에 안고서\r\n" + "하염없이 눈물만 흘려볼까\r\n" + "그리운 마음이 서럽게 흘러넘쳐\r\n" + "너에게 닿을 때\r\n"
						+ "우리 만날 수 있을까\r\n" + "다시 만날 수 있을까\r\n" + "그리 좋던 예전처럼 그때처럼\r\n" + "되돌아갈 수 있을까\r\n"
						+ "다시 우리가 만나면\r\n" + "무엇을 해야만 할까\r\n" + "서로를 품에 안고서\r\n" + "하염없이 눈물만 흘려볼까"));

		list.add(new Music(12, "BE'O (비오)", "LOVE me", "LOVE me", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/16/904/10916904_20220412101049_500.jpg?a7f6649d1e80e83e191d90670a576931/melon/resize/282/quality/80/optimize",
				"Hey girl, Where you at? (Where you at?)\r\n" + "대체 어디서 뭐 하는지 궁금해\r\n" + "기분이 너무 Bad Bad (So bad)\r\n"
						+ "침대가 허전해 잠이 안 오잖아\r\n" + "\r\n" + "재미도 없어 TV show\r\n" + "너 데리고 놀던 Pretty boy\r\n"
						+ "그 고민을 내게 털어놓던\r\n" + "너의 표정이 아직 선명해\r\n" + "\r\n" + "소파에 벤 니 향기가 비릿해\r\n"
						+ "내 몸이 자꾸 빠져 깊이 Yeah\r\n" + "미리 알아도 난 이리\r\n" + "멍청하게 행동을 해버린다니까\r\n" + "\r\n"
						+ "Oh please\r\n" + "Love me love me love me\r\n" + "I know, I'm stupid\r\n"
						+ "어쩔 수 없어 널 보고 싶은걸\r\n" + "\r\n" + "Oh please\r\n" + "Love me love me love me\r\n"
						+ "I know, I'm stupid\r\n" + "어쩔 수 없어 널 보고 싶은걸\r\n" + "\r\n" + "Now I say I love you\r\n"
						+ "So I love you\r\n" + "Now I say I love you\r\n" + "나 아프더라도 몰라\r\n" + "\r\n"
						+ "Now I say I love you\r\n" + "So I love you\r\n" + "Now I say I love you\r\n"
						+ "나 아프더라도 몰라\r\n" + "\r\n" + "Oh please\r\n" + "Love me love me love me\r\n"
						+ "I know, I'm stupid\r\n" + "어쩔 수 없어 널 보고 싶은걸\r\n" + "\r\n" + "Oh please\r\n"
						+ "Love me love me love me\r\n" + "I know, I'm stupid\r\n" + "어쩔 수 없어 널 보고 싶은걸\r\n"
						+ "Now I say I love you"));

		list.add(new Music(13, "Red Velvet (레드벨벳)", "Feel My Rhythm", "The ReVe Festival 2022", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/94/554/10894554_20220321100622_500.jpg?d53e7525c3212538fa0b850bca4e7369/melon/resize/282/quality/80/optimize",
				"Red Velvet\r\n" + "\r\n" + "무도회를 뒤집어\r\n" + "작은 소란을 또 일으켜\r\n" + "This is gonna be a crazy night\r\n"
						+ "(To-na-na-na-na-na-night)\r\n" + "\r\n" + "등장부터 인사까지 파격적이게\r\n" + "우리 살짝 놀아볼까\r\n"
						+ "솔직하게 Bae bae\r\n" + "지금부터 시작해 볼게\r\n" + "(Feel my vibe and sway)\r\n" + "\r\n"
						+ "꽃가루를 날려\r\n" + "폭죽을 더 크게 터트려\r\n" + "우릴 오만과 편견에 가두지 마\r\n" + "자유로워 지금\r\n" + "\r\n"
						+ "Feel my rhythm Come with me\r\n" + "상상해 봐 뭐든지\r\n" + "노래를 따라서 저 달빛에 춤을 춰\r\n"
						+ "바로 지금 (Play my rhythm)\r\n" + "\r\n" + "Follow follow my heartbeat\r\n" + "해가 떠올 때까지\r\n"
						+ "Feel my rhythm 멈추지 말아 줘\r\n" + "이 순간을 놓지 마 Baby\r\n" + "\r\n" + "차는 Old and Classic\r\n"
						+ "(Just ride)\r\n" + "이제 조금 낯선 다른 차원까지\r\n" + "(Get loud)\r\n" + "상상할 수 없던 곳 시간 속\r\n"
						+ "예고 없이 등장해\r\n" + "이 밤은 멋지고 우린\r\n" + "Fun and wild and brave\r\n" + "\r\n"
						+ "시선을 끄는 네 Motion\r\n" + "G-give me a new direction\r\n" + "끝없는 Black hole처럼\r\n"
						+ "빠져드는 Sweet emotion\r\n" + "너를 태운 채 (Sway)\r\n" + "어디로든 떠날래 (Way)\r\n" + "온 세상 모든 경계를\r\n"
						+ "다 휘저을래 (Oh yeah)\r\n" + "\r\n" + "꽃가루를 날려\r\n" + "(흩날려)\r\n" + "Champagne을 더 크게 터트려\r\n"
						+ "(마음껏)\r\n" + "더는 어제와 내일에 가두지 마\r\n" + "자유로워 지금"));

		list.add(new Music(14, "김민석 (멜로망스)", "취중고백", "취중고백", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/16/959/10816959_20211217144957_500.jpg?c1818ddc493cb2bbb4d268431e6de7b5/melon/resize/282/quality/80/optimize",
				"뭐하고 있었니 늦었지만\r\n" + "잠시 나올래\r\n" + "너의 집 골목에 있는\r\n" + "놀이터에 앉아 있어\r\n" + "친구들 만나서 오랜만에\r\n"
						+ "술을 좀 했는데\r\n" + "자꾸만 니 얼굴 떠올라\r\n" + "무작정 달려왔어\r\n" + "이 맘 모르겠니\r\n" + "요즘 난 미친 사람처럼\r\n"
						+ "너만 생각해\r\n" + "대책없이 네가 점점 좋아져\r\n" + "아냐 안 취했어 진짜야\r\n" + "널 정말 사랑해\r\n"
						+ "눈물이 날만큼 원하고 있어\r\n" + "정말로 몰랐니\r\n" + "가끔 전화해 장난치듯\r\n" + "주말엔 뭐할거냐며\r\n" + "너의 관심 끌던 나를\r\n"
						+ "그리고 한번씩 누나 주려 샀는데\r\n" + "너 그냥 준다고\r\n" + "생색 낸 선물도 너 때문에 산거야\r\n" + "이 맘 모르겠니\r\n"
						+ "요즘 난 미친 사람처럼\r\n" + "너만 생각해\r\n" + "대책없이 네가 점점 좋아져\r\n" + "아냐 안 취했어 진짜야\r\n" + "널 정말 사랑해\r\n"
						+ "진심이야 믿어줘\r\n" + "갑자기 이런 말 놀랐다면 미안해\r\n" + "부담이 되는게 당연해\r\n" + "이해해 널\r\n"
						+ "하지만 내 고백도 이해해 주겠니 oh\r\n" + "지금 당장 대답하진마\r\n" + "나와 일주일만 사귀어줄래\r\n" + "후회없이 잘 해주고 싶은데\r\n"
						+ "그 후에도 니가 싫다면\r\n" + "나 그때 포기할게\r\n" + "귀찮게 안할게 혼자 아플게\r\n" + "진심이야 너를 사랑하고 있어"));

		list.add(new Music(15, "박재범", "GANADARA (Feat. 아이유)", "Proof", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/89/981/10889981_20220311110820_500.jpg?281b24fc59e617f3be73ebea48195a9f/melon/resize/282/quality/80/optimize",
				"길거리를 걷다 보면\r\n" + "사랑 노래만 흘러나와\r\n" + "나는 왜 저런 게 낯설까\r\n" + "난 한국말까지 서툴러\r\n" + "번역기도 전혀 도움 안 돼\r\n"
						+ "네 맘엔 어떨까 걱정만\r\n" + "어떤 단어를 쓸지 I don’t know\r\n" + "어떤 말을 할지 I don’t know\r\n"
						+ "나는 왜 이런지 I don’t know\r\n" + "You’re on my mind\r\n" + "어떤 단어를 쓸지 I don’t know\r\n"
						+ "어떤 말을 할지 I don’t know\r\n" + "나는 왜 이런지 I don’t know\r\n" + "You’re on my mind\r\n"
						+ "Baby 정말 생각 안 나\r\n" + "Body language로 자신 있어\r\n" + "보여줄게\r\n"
						+ "girl just give me some your time\r\n" + "너를 보면 손에 땀 나\r\n" + "긴장 풀게 한 번 웃어줘\r\n"
						+ "Let me take u on a magic carpet ride\r\n" + "손을 잡아 따라와\r\n" + "맑은 날씨 보름달\r\n"
						+ "가르쳐줘 오늘 밤\r\n" + "가나다라마바사\r\n" + "손을 잡아 따라와\r\n" + "맑은 날씨 보름달\r\n" + "가르쳐줘 오늘 밤\r\n"
						+ "가나다라마바사\r\n" + "너무 완벽하지 않아도\r\n" + "걱정 마 네 맘을 조금 알 것 같아\r\n" + "네게 좀 더 다가서 볼까\r\n"
						+ "고민해 매일 밤\r\n" + "길거리를 걷다 보면\r\n" + "계속 계속 네 생각이 나\r\n" + "이런 내 모습이 왜 낯설까\r\n" + "번역기 위에서\r\n"
						+ "헤매는 네 손가락까지\r\n" + "자꾸만 생각이 나는 걸\r\n" + "Body language도 나는 괜찮아\r\n"
						+ "But 생각 안 나면 그냥 웃어줘\r\n" + "모든 것을 알려줄게 오늘 밤\r\n" + "내가 나쁜 남자처럼 보여도\r\n" + "너를 볼 때면 맘이 여려져\r\n"
						+ "I wouldn’t mind if I died in your arms\r\n" + "손을 잡아 따라와\r\n" + "맑은 날씨 보름달\r\n"
						+ "가르쳐줘 오늘 밤\r\n" + "가나다라마바사\r\n" + "손을 잡아 따라와\r\n" + "맑은 날씨 보름달\r\n" + "가르쳐줘 오늘 밤\r\n"
						+ "가나다라마바사\r\n" + "손을 잡아 따라와\r\n" + "맑은 날씨 보름달\r\n" + "가르쳐줘 오늘 밤\r\n" + "가나다라마바사\r\n"
						+ "손을 잡아 따라와\r\n" + "맑은 날씨 보름달\r\n" + "가르쳐줘 오늘 밤\r\n" + "가나다라마바사"));

		list.add(new Music(16, "임영웅", "이제 나만 믿어요", "내일은 미스터트롯 우승자 특전곡", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/104/12/319/10412319_20200403103006_500.jpg?1a1ff62cf6843868fc53b9eaf4c28f86/melon/resize/282/quality/80/optimize",
				"무얼 믿은 걸까 부족했던 내게서\r\n" + "나조차 못 믿던 내게 여태 머문 사람\r\n" + "무얼 봤던 걸까 가진 것도 없던 내게\r\n"
						+ "무작정 내 손을 잡아 날 이끈 사람\r\n" + "최고였어\r\n" + "그대 눈 속에 비친 내 모습\r\n" + "이제는 내게서 그댈 비춰줄게\r\n"
						+ "궂은 비가 오면\r\n" + "세상 가장 큰 그대 우산이 될게\r\n" + "그댄 편히 걸어가요\r\n" + "걷다가 지치면\r\n"
						+ "내가 그대를 안고 어디든 갈게\r\n" + "이제 나만 믿어요\r\n" + "나만 두고 가던\r\n" + "나만 스쳐 간 행운이 모여\r\n"
						+ "그대가 되어서 내게 와준 거야\r\n" + "궂은 비가 오면\r\n" + "세상 가장 큰 그대 우산이 될게\r\n" + "그댄 편히 걸어가요\r\n"
						+ "걷다가 지치면\r\n" + "내가 그대를 안고 어디든 갈게\r\n" + "이제 나만 믿어요\r\n" + "나의 마지막 주인공이 되어\r\n"
						+ "다신 누구 앞에서도\r\n" + "그대는 고개 숙이지 마요\r\n" + "내가 보지 못했던 홀로 고단했던 시간\r\n" + "고맙고 미안해요 사랑해요\r\n"
						+ "이 세상은\r\n" + "우리를 두고 오랜 장난을 했고\r\n" + "우린 속지 않은 거야\r\n" + "이제 울지 마요\r\n"
						+ "좋을 땐 밤새도록 맘껏 웃어요\r\n" + "전부 그대 꺼니까\r\n" + "그대는 걱정 말아요\r\n" + "이제 나만 믿어요"));

		list.add(new Music(17, "임영웅", "무지개", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"오늘 하루 어땠었나요\r\n" + "많이 힘들었나요\r\n" + "쉬지 않고 달려왔던 길에서\r\n" + "나와 함께 쉬어가요\r\n" + "그냥 아무런 준비도 없이\r\n"
						+ "떠나볼까요\r\n" + "평범해도 좋으니까\r\n" + "우리 함께 가요\r\n" + "Du Du Du Du Du\r\n"
						+ "행복 가득 담은 배낭 하나 메고서\r\n" + "답답했던 일상과 도심을 벗어나\r\n" + "Du Du Du Du\r\n" + "Du Du Du Du\r\n"
						+ "떠나볼래요\r\n" + "힘껏 살다 보니 무뎌져\r\n" + "헝클어진 머리도\r\n" + "괜찮다며 그댈 안아줄 사람\r\n" + "바로 그대 곁에 있죠\r\n"
						+ "까만 선글라스 하나 챙겨서\r\n" + "떠나볼까요\r\n" + "평범해도 좋으니까\r\n" + "우리 함께 가요\r\n" + "Du Du Du Du Du\r\n"
						+ "행복 가득 담은 배낭 하나 메고서\r\n" + "답답했던 일상과 도심을 벗어나\r\n" + "Du Du Du Du\r\n" + "Du Du Du Du\r\n"
						+ "떠나볼래요\r\n" + "우리 함께 가요\r\n" + "Du Du Du Du Du\r\n" + "행복 가득 담은 배낭 하나 메고서\r\n"
						+ "답답했던 일상과 도심을 벗어나\r\n" + "Du Du Du Du\r\n" + "Du Du Du Du\r\n" + "떠나볼래요\r\n" + "우리 함께 가요\r\n"
						+ "Du Du Du Du Du\r\n" + "Du Du Du Du\r\n" + "Du Du Du Du\r\n" + "떠나볼래요\r\n" + "Du Du Du Du\r\n"
						+ "Du Du Du Du\r\n" + "떠나볼래요\r\n" + "Du Du Du Du\r\n" + "Du Du Du Du\r\n" + "지금 떠나요"));

		list.add(new Music(18, "세븐틴", "HOT", "SEVENTEEN 4th Album 'Face the Sun'", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/22/231/10922231_20220527120653_500.jpg?d4668bd274949f814ae2ccadee6f42eb/melon/resize/282/quality/80/optimize",
				"모두 우릴 쳐다봐 (봐)\r\n" + "태양 위를 달리는 마차 (계속 달려 Uh)\r\n" + "Juicy Juicy Juicy Juicy\r\n" + "\r\n"
						+ "총성이 울려 퍼진 다음 (Spicy한 Feelin’)\r\n" + "태양을 마음에다 쏴 (I just wanna do this)\r\n"
						+ "Juicy Juicy\r\n" + "\r\n" + "음악 소리 크게 Turn up\r\n" + "세상을 사정없이 달려\r\n"
						+ "태양을 뒤에 달고 밟아 경적 울려 우리답게 Fire (우리답게)\r\n" + "\r\n" + "뭘 따라가려 해 (뭘 따라가려 해)\r\n"
						+ "우리 방식대로 더 더 (우리 방식대로 더 더)\r\n" + "Say ah 뜨거워 뜨거워 뜨거워\r\n" + "\r\n" + "밤이 없는 낮 하늘은 붉은색\r\n"
						+ "모든 세상에 빛은 하나인 듯해 (하나 된 듯이)\r\n" + "벅찬 심호흡과 리듬 과열 Vibe\r\n" + "운명의 태양에 내일을 걸어봐\r\n"
						+ "따라오라 Go\r\n" + "\r\n" + "우리는 Drop it like HOT HOT HOT (Oh 지금 Feelin’ so HOT)\r\n"
						+ "이 노래 Burnin’ like HOT HOT HOT HOT (Boom Brr Boom Boom)\r\n"
						+ "우리는 Drop it like HOT HOT HOT (Oh 지금 Feelin’ so HOT)\r\n"
						+ "Yeah I’m runnin’ too HOT HOT HOT HOT (Boom Brr Boom Boom)\r\n" + "\r\n" + "태양을 향해 불붙여라\r\n"
						+ "아주 뜨겁게 (Boom Brr Boom Boom)\r\n" + "태양을 향해 불붙여라\r\n" + "뜨거워 이 노래 Everybody 떼창\r\n" + "\r\n"
						+ "Ay 나팔을 불어라 사막의 파도 사이로 Drive away\r\n" + "I don’t want uh one more chance\r\n"
						+ "이 순간에 모든 걸 걸을래\r\n" + ""));

		list.add(new Music(19, "임영웅", "아버지", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"하얀 머리 뽑아 달라며\r\n" + "한 개 백 원이라던\r\n" + "그 시절 다 지나가고\r\n" + "이젠 흰 눈만 남았네\r\n" + "그렇게도 힘이 드냐며\r\n"
						+ "나를 위로하시다\r\n" + "어느새 잠들어버린\r\n" + "주름만 남은 내 아버지\r\n" + "세상이 아무리 힘들어도\r\n"
						+ "당신 있으면 견딜 것 같아\r\n" + "오래오래 날 지키며\r\n" + "그냥 곁에만 있어 주세요\r\n" + "활짝 웃는 모습이 어린애 같아 보여도\r\n"
						+ "아프다 말도 못 하는 사람\r\n" + "이제는 내가 지켜줄게\r\n" + "어린아이로 돌아가 버린\r\n" + "사랑하는 내 아버지\r\n"
						+ "오래오래 날 지키며\r\n" + "그냥 곁에만 있어 주세요\r\n" + "활짝 웃는 모습이\r\n" + "어린애 같아 보여도\r\n"
						+ "아프다 말도 못 하는 사람\r\n" + "이제는 내가 지켜줄게\r\n" + "어린아이로 돌아가 버린\r\n" + "사랑하는 내 아버지\r\n"
						+ "사랑해요 내 아버지"));

		list.add(new Music(20, "제시 (Jessi)", "ZOOM", "ZOOM", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/18/269/10918269_20220413101153_500.jpg?6b884a5228cdb9e76abd757ab351c9e1/melon/resize/282/quality/80/optimize",
				"Lights Camera Action\r\n" + "\r\n" + "I see you lookin at my P I C (I know)\r\n"
						+ "크게 땡겨 땡겨 좀 더 땡겨봐 봐 기똥차지\r\n" + "Zoom In, Zoom Out (OK)\r\n" + "Zoom In, Zoom Out (OK)\r\n"
						+ "Zoom In, Zoom Out (OK)\r\n" + "Baby 확 가게 확대 확실하게 Oww~\r\n" + "\r\n"
						+ "I’m feelin like a million bucks yeah\r\n" + "Must be the million bucks yeah\r\n"
						+ "오늘따라 빛이나\r\n" + "Selfie 찰칵하면 빛이나\r\n" + "Always talkin 쉿 know you like that\r\n"
						+ "쫄지마 앙 물지는 않을게\r\n" + "Yea it’s like that, hey hey pretty lil thang\r\n"
						+ "Do ya thang, I’ll be right back\r\n" + "\r\n" + "(Woo) 우린 모두 사진 찍기 위해 살아\r\n"
						+ "나도 그래 네 맘 알아 Aight\r\n" + "(Woo) 우린 모두 관심받기 위해 살아\r\n" + "나도 그래 네 맘 알아 Aight!\r\n" + "\r\n"
						+ "Lights Camera Action Baby\r\n" + "\r\n" + "I see you lookin at my P I C (I know)\r\n"
						+ "크게 땡겨 땡겨 좀 더 땡겨봐 봐 기똥차지\r\n" + "Zoom In, Zoom Out (OK)\r\n" + "Zoom In, Zoom Out (OK)\r\n"
						+ "Zoom In, Zoom Out (OK)\r\n" + "Baby 확 가게 확대 확실하게 Oww~\r\n" + "\r\n"
						+ "Do you like all my clothes and my bags?\r\n" + "옷을 입고 가방 멨을 뿐인데?\r\n"
						+ "Why you like it when I’m sad or I’m mad?\r\n" + "I don’t give uh, cuz I’ma bad\r\n"
						+ "빛이 빛이 나는 Wishlist 항상 일 Pick\r\n" + "물어보지 좀 마 언니 뭐야 립스틱?\r\n"
						+ "It’s funny how you always talking money\r\n" + "But always playin a dummy\r\n"
						+ "Yous a bummy beggin yo mummy for money"));

		list.add(new Music(21, "이무진", "신호등", "신호등", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/106/07/796/10607796_20210513201807_500.jpg?cb1d50410b364ec4c2a4848adbf5eb68/melon/resize/282/quality/80/optimize",
				"이제야 목적지를 정했지만\r\n" + "가려한 날 막아서네 난 갈 길이 먼데\r\n" + "새빨간 얼굴로 화를 냈던\r\n" + "친구가 생각나네\r\n"
						+ "이미 난 발걸음을 떼었지만\r\n" + "가려한 날 재촉하네 걷기도 힘든데\r\n" + "새파랗게 겁에 질려 도망간\r\n" + "친구가 뇌에 맴도네\r\n"
						+ "건반처럼 생긴 도로 위\r\n" + "수많은 동그라미들 모두가\r\n" + "멈췄다 굴렀다 말은 잘 들어\r\n" + "그건 나도 문제가 아냐\r\n"
						+ "붉은색 푸른색 그 사이\r\n" + "3초 그 짧은 시간\r\n" + "노란색 빛을 내는\r\n" + "저기 저 신호등이\r\n"
						+ "내 머릿속을 텅 비워버려\r\n" + "내가 빠른지도\r\n" + "느린지도 모르겠어\r\n" + "그저 눈앞이 샛노랄 뿐이야\r\n"
						+ "솔직히 말하자면 차라리\r\n" + "운전대를 못 잡던 어릴 때가\r\n" + "더 좋았었던 것 같아\r\n" + "그땐 함께 온 세상을\r\n"
						+ "거닐 친구가 있었으니\r\n" + "건반처럼 생긴 도로 위\r\n" + "수많은 조명들이 날 빠르게\r\n" + "번갈아 가며 비추고 있지만\r\n"
						+ "난 아직 초짜란 말이야\r\n" + "붉은색 푸른색 그 사이\r\n" + "3초 그 짧은 시간\r\n" + "노란색 빛을 내는 저기 저 신호등이\r\n"
						+ "내 머릿속을 텅 비워버려\r\n" + "내가 빠른지도\r\n" + "느린지도 모르겠어\r\n" + "그저 눈앞이 샛노랄 뿐이야\r\n"
						+ "꼬질꼬질한 사람이나\r\n" + "부자 곁엔 아무도 없는\r\n" + "삼색 조명과 이색 칠 위에\r\n" + "서 있어 괴롭히지 마\r\n"
						+ "붉은색 푸른색 그 사이\r\n" + "3초 그 짧은 시간\r\n" + "노란색 빛을 내는 저기 저 신호등이\r\n" + "내 머릿속을 텅 비워버려\r\n"
						+ "내가 빠른지도\r\n" + "느린지도 모르겠어\r\n" + "그저 눈앞이 샛노랄 뿐이야"));

		list.add(new Music(22, "경서예지, 전건호", "다정히 내 이름을 부르면", "다정히 내 이름을 부르면", "",
				"https://cdnimg.melon.co.kr/cm2/album/images/106/10/525/10610525_20210518143433_500.jpg?e8c5aa44ff6608c13fa48eb6a20e81af/melon/resize/282/quality/80/optimize",
				"끝없이 별빛이 내리던 밤\r\n" + "기분 좋은 바람이\r\n" + "두 빰을 스치고\r\n" + "새벽 바다 한곳을 보는\r\n" + "아름다운 너와 나\r\n"
						+ "그림을 그려갔어\r\n" + "모래 위 떨린 손끝으로\r\n" + "날 향해 웃어주는 입술\r\n" + "끝 모양과 저 달보다\r\n"
						+ "사랑스러운 두 눈을 가진 네가\r\n" + "다정히 내 이름을\r\n" + "부르면 내 마음이\r\n" + "녹아내려 언제나\r\n"
						+ "나 하날 위해 준비된\r\n" + "선물 같아 널 안으면\r\n" + "잠들지 않는 바다 위를\r\n" + "너와 함께 걷는 거 같아\r\n"
						+ "하늘 아래 너와 나\r\n" + "남은 내 모든 날을 너에게\r\n" + "다 줘도 안 아까워\r\n" + "이제서야 내가\r\n"
						+ "사랑에 눈을 뜬 건 가봐\r\n" + "경험하지 못했고\r\n" + "믿기지 않는 일만\r\n" + "일어나고 있는 거 아니\r\n"
						+ "5월에 피는 봄꽃 처럼\r\n" + "내 사랑도 피어나\r\n" + "부는 바람에 살며시 실어 보내\r\n" + "다정히 내 이름을\r\n"
						+ "부르면 내 마음이\r\n" + "녹아내려 언제나\r\n" + "나 하날 위해 준비된\r\n" + "선물 같아 널 안으면\r\n" + "잠들지 않는 바다 위를\r\n"
						+ "너와 함께 걷는 거 같아"));

		list.add(new Music(23, "임영웅", "손이 참 곱던 그대", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"끝없이 별빛이 내리던 밤\r\n" + "기분 좋은 바람이\r\n" + "두 빰을 스치고\r\n" + "새벽 바다 한곳을 보는\r\n" + "아름다운 너와 나\r\n"
						+ "그림을 그려갔어\r\n" + "모래 위 떨린 손끝으로\r\n" + "날 향해 웃어주는 입술\r\n" + "끝 모양과 저 달보다\r\n"
						+ "사랑스러운 두 눈을 가진 네가\r\n" + "다정히 내 이름을\r\n" + "부르면 내 마음이\r\n" + "녹아내려 언제나\r\n"
						+ "나 하날 위해 준비된\r\n" + "선물 같아 널 안으면\r\n" + "잠들지 않는 바다 위를\r\n" + "너와 함께 걷는 거 같아\r\n"
						+ "하늘 아래 너와 나\r\n" + "남은 내 모든 날을 너에게\r\n" + "다 줘도 안 아까워\r\n" + "이제서야 내가\r\n"
						+ "사랑에 눈을 뜬 건 가봐\r\n" + "경험하지 못했고\r\n" + "믿기지 않는 일만\r\n" + "일어나고 있는 거 아니\r\n"
						+ "5월에 피는 봄꽃 처럼\r\n" + "내 사랑도 피어나\r\n" + "부는 바람에 살며시 실어 보내\r\n" + "다정히 내 이름을\r\n"
						+ "부르면 내 마음이\r\n" + "녹아내려 언제나\r\n" + "나 하날 위해 준비된"));

		list.add(new Music(24, "태연 (TAEYEON)", "INVU", "INVU - The 3rd Album", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/63/559/10863559_20220214160739_500.jpg?42c2b52a394ac94dad21d64aec2c577d/melon/resize/282/quality/80/optimize",
				"Falling in love\r\n" + "너에겐 난 Option\r\n" + "시작부터 다른 너와 나\r\n" + "깨지는 Heart\r\n" + "빗나간 네 Mention\r\n"
						+ "익숙하거든\r\n" + "\r\n" + "I think I lost my mind\r\n" + "But It’s my kind of love\r\n"
						+ "아끼지 않고 다\r\n" + "쏟아내고는 주저앉아\r\n" + "문득 어느 순간\r\n" + "지친 내가 보여\r\n" + "애쓰고 있지만\r\n" + "\r\n"
						+ "So I can’t love you\r\n" + "Even though I do\r\n" + "밀어내 봐도\r\n" + "난 너를 못 이겨\r\n" + "\r\n"
						+ "날 버리고\r\n" + "날 잃을수록\r\n" + "넌 반짝이는 아이러니\r\n" + "\r\n" + "So I N V U\r\n" + "I N V U\r\n"
						+ "I N V U\r\n" + "\r\n" + "기대지 마\r\n" + "기대하지도 마\r\n" + "몇 번을 되뇌고 되놰도\r\n" + "그 손길 한 번에\r\n"
						+ "무너지는 날 볼 때\r\n" + "네 기분은 어때\r\n" + "\r\n" + "I guess I lost my mind\r\n"
						+ "Yeah It’s my kind of love\r\n" + "늘 처음인 것처럼\r\n" + "서툴러서 또 상처가 나\r\n" + "무뎌지기 전에\r\n"
						+ "아물기도 전에\r\n" + "잔뜩 헤집어놔\r\n" + "\r\n" + "So I can’t love you\r\n" + "Even though I do\r\n"
						+ "밀어내 봐도\r\n" + "난 너를 못 이겨\r\n" + "\r\n" + "날 버리고\r\n" + "날 잃을수록\r\n" + "넌 반짝이는 아이러니\r\n"
						+ "\r\n" + "So I N V U\r\n" + "I N V U\r\n" + "I N V U\r\n" + "\r\n" + "식은 온기\r\n"
						+ "부서진 맘이\r\n" + "자꾸 날 할퀴어\r\n" + "아파도 못 멈춰\r\n" + "So when you leave\r\n"
						+ "Please make it easy\r\n" + "Cause I N V U\r\n" + "\r\n" + "I N V U\r\n" + "I N V U\r\n"
						+ "I N V U\r\n" + "\r\n" + "I N V U"));

		list.add(new Music(25, "IVE (아이브)", "ELEVEN", "ELEVEN", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/107/98/794/10798794_20211201113915_500.jpg?4b89cd385817f7519af259b2c32170f0/melon/resize/282/quality/80/optimize",
				"따분한 나의 눈빛이\r\n" + "무표정했던 얼굴이\r\n" + "널 보며 빛나고 있어\r\n" + "널 담은 눈동자는 odd\r\n" + "\r\n"
						+ "내 안에 빼곡하게 피어나는 blue\r\n" + "내가 지금 느끼는 이 감정들은 true\r\n" + "내 입술을 간지럽힌 낯선 그 이름\r\n"
						+ "난 몰랐어 내 맘이 이리 다채로운지\r\n" + "\r\n" + "긴 꿈을 꾸게 해 이 방은 작은 heaven\r\n" + "춤을 추곤 해 실컷 어지러울 만큼\r\n"
						+ "Oh my, oh my god\r\n" + "한 칸 더 채우고 있어\r\n" + "잘 봐 1, 2, 3, 4, 5, 6, 7\r\n"
						+ "You make me feel like eleven\r\n" + "\r\n" + "투명한 너와 나의 사이\r\n" + "가만히 들여다보다\r\n"
						+ "일렁인 물결 속으로\r\n" + "더 빠져드는 걸\r\n" + "\r\n" + "그날 향기로운 보랏빛의 mood\r\n"
						+ "셀 수 없이 반복해도 기분 좋은 꿈\r\n" + "감히 누가 이렇게 날 설레게 할 줄\r\n" + "난 몰랐어 내 맘이 이리 다채로운지\r\n" + "\r\n"
						+ "긴 꿈을 꾸게 해 이 방은 작은 heaven\r\n" + "춤을 추곤 해 실컷 어지러울 만큼\r\n" + "Oh my, oh my god\r\n"
						+ "한 칸 더 채우고 있어\r\n" + "잘 봐 1, 2, 3, 4, 5, 6, 7\r\n" + "You make me feel like eleven\r\n"
						+ "\r\n" + "내 앞에 있는 너를\r\n" + "그 눈에 비친 나를 (그 눈에 비친 나를)\r\n" + "Aya, aya, aya (가만히 바라봐)\r\n"
						+ "내 앞에 있는 너를\r\n" + "그 눈에 비친 나를\r\n" + "가만히 바라봐\r\n" + "\r\n" + "Don't say now\r\n"
						+ "서둘러 오진 마\r\n" + "이 순간이 좋아 난\r\n" + "미처 몰랐어 내 맘이 이리 다채로운지\r\n" + "\r\n"
						+ "긴 꿈을 꾸게 해 이 방은 작은 heaven\r\n" + "춤을 추곤 해 실컷 어지러울 만큼\r\n" + "Oh my, oh my god\r\n"
						+ "한 칸 더 채우고 있어\r\n" + "잘 봐 1, 2, 3, 4, 5, 6, 7\r\n" + "You make me feel like eleven\r\n"
						+ "\r\n" + "내 앞에 있는 너를\r\n" + "그 눈에 비친 나를\r\n" + "Aya, aya, aya\r\n" + "내 앞에 있는 너를\r\n"
						+ "그 눈에 비친 나를\r\n" + "사랑하게 됐거든"));

		list.add(new Music(26, "임영웅", "A bientot", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"A bientot\r\n" + "A bientot\r\n" + "이 밤이 지나면 괜찮아질 수 있을까\r\n" + "쓰린 내 맘이 회복될 수가 있을까\r\n"
						+ "네가 떠난 빈자리가 너무 크니까\r\n" + "그 공허함에 깔려 겨우 살고 있잖아\r\n" + "기억은 잔인하고 후유증은 지독해\r\n"
						+ "겨우 잠을 이뤄도 꿈자리는 뒤숭숭해\r\n" + "마음의 반을 도려내 버리고 난 후에\r\n" + "너라는 감옥에서 풀려날 수 있었네\r\n"
						+ "38도 탕 안처럼 포근한\r\n" + "그날의 온도는 아직도 나의 가슴에\r\n" + "깊게 뿌리내려 뻗어 미련이란 놈은\r\n"
						+ "공기처럼 내 마음을 드나드네\r\n" + "넌 빌런이자 하나님이야\r\n" + "셀 수 없는 많은 노래를\r\n" + "잉태하고 부숴버렸네\r\n"
						+ "널 향해 나는 기도해\r\n" + "널 향해 나는 기도해\r\n" + "A bientot\r\n" + "A bientot\r\n" + "인생은 너무 외로워\r\n"
						+ "너에게 전화를 거네요\r\n" + "A bientot\r\n" + "A bientot\r\n" + "인생은 너무 외로워\r\n" + "너에게 전화를 거네요"));

		list.add(new Music(27, "임영웅", "사랑해 진짜", "IM HERO", "",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"숱한 날들 모두 내게 남아있는 추억들\r\n" + "빛바랜 기억들 사이\r\n" + "그대 모습만이 아련하게 빛나네\r\n" + "지나간 세월이 야속하진 않아\r\n"
						+ "그댈 만났으므로\r\n" + "피어날 내일을 기대해 오\r\n" + "그대 내게 와줬으니\r\n" + "나 진짜 진짜 당신만을 사랑하고 사랑해\r\n"
						+ "내 삶의 반쪽 그대만을\r\n" + "아 나는 그대만 보고 있어\r\n" + "아 나는 그대를 사랑합니다\r\n" + "오색빛의 색이 물든 미완성의 그림 하나\r\n"
						+ "그래 내 마음 같겠지\r\n" + "어느 날 그대가 내게 오기 전까지\r\n" + "지나간 시간이 야속하진 않아\r\n" + "그댈 만났으므로\r\n"
						+ "피어날 내일을 기대해\r\n" + "그대 내게 와줬으니\r\n" + "나 진짜 진짜 당신만을 사랑하고 사랑해\r\n" + "내 삶의 반쪽 그대만을\r\n"
						+ "아 나는 그대만 보고 있어\r\n" + "아 나는 그대를 사랑합니다"));

		list.add(new Music(28, "(여자)아이들", "MY BAG", "I NEVER DIE", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/90/384/10890384_20220314111504_500.jpg?4b9dba7aeba43a4e0042eedb6b9865c1/melon/resize/282/quality/80/optimize",
				"Red five diamonds in my bag\r\n" + "If you wanna see it, dance to a beat like that\r\n"
						+ "My mama saw it and ‘Oh my god dang’\r\n" + "Ok I’ll show you what’s in my bag\r\n" + "\r\n"
						+ "Red five diamonds in my bag\r\n" + "If you wanna see it, dance to a beat like that\r\n"
						+ "My mama saw it and ‘Oh my god dang’\r\n" + "Ok I’ll show you what’s in my bag\r\n" + "\r\n"
						+ "Uh oh I know you like it\r\n" + "My voice는 말해 뭐 해 God dang\r\n" + "Uh oh I just like it\r\n"
						+ "태생부터 많은 Money 관심 없지\r\n" + "\r\n" + "싸가지 없는 무대의 못된 범인의 눈빛\r\n" + "Fantasy란 말은 나를 빼고 다 금지\r\n"
						+ "글러 먹은 너의 감 모두 나를 위한 밥\r\n" + "독한 Vibe sugar high 맛 좀 봐라 모두 Die\r\n" + "\r\n"
						+ "Rum-rum-rum Rumble 다 Crumble\r\n" + "이 Voice는 Drum에도 No lose\r\n"
						+ "No no no lovely I’m Bumblebee\r\n" + "그냥 훅 들어갈 뿐 안 해 One, two\r\n" + "\r\n"
						+ "I never had 겁 a.k.a “Giant dog”\r\n" + "아차 하고 쓰다듬은 다쳐 이건 어쩜 범\r\n"
						+ "I value my love 그만 두들겨 너\r\n" + "머리 빈 멍청이들과는 노는 물이 전혀 달라 Ye you know\r\n" + ""));

		list.add(new Music(29, "세븐틴", "Domino", "SEVENTEEN 4th Album 'Face the Sun'", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/22/231/10922231_20220527120653_500.jpg?d4668bd274949f814ae2ccadee6f42eb/melon/resize/282/quality/80/optimize",
				"옆에 서 있을 때 위태로워\r\n" + "자연스러운 긴장이 좋은 나\r\n" + "투명한 내 맘을 넌 다 알아\r\n" + "Take it all Take it all\r\n"
						+ "\r\n" + "널 뒤에서 안고 있을 때 난\r\n" + "뭐든 할 수 있을 것만 같아\r\n" + "달콤한 세계로 데려가 줘\r\n"
						+ "Here we go Here we go\r\n" + "\r\n" + "I’m tryin’ to hold on\r\n" + "날 무방비 상태로 만들어\r\n"
						+ "I can’t fight it\r\n" + "내 모든 건 널 따라서 움직여\r\n" + "I’m feeling like\r\n"
						+ "3, 2, 1 Domino\r\n" + "\r\n" + "툭 하고 나를 건드리며\r\n" + "후 하고 숨을 뱉어주면\r\n"
						+ "난 한순간에 넘어지지 Like a Domino\r\n" + "\r\n" + "차례대로 쓰러지는\r\n" + "이 기분은 Nobody knows\r\n"
						+ "한 방에 난 넘어가지 Like a Domino\r\n" + "\r\n" + "넘어가지 Like a Domino\r\n" + "\r\n"
						+ "내게로 선을 넘어 안겨줘\r\n" + "널 안고 난 넘어질 수 있어\r\n" + "넌 날 꽉 잡고 있어 주면 돼\r\n"
						+ "Here we go Here we go\r\n" + ""));

		list.add(new Music(30, "MSG워너비(M.O.M)", "듣고 싶을까", "듣고 싶을까", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/80/544/10880544_20220225141002_500.jpg?40e919481d78a3356e98436f44acee24/melon/resize/282/quality/80/optimize",
				"우리 함께 듣던 그 노랠 듣고 싶을까\r\n" + "듣고 나서 잠시 날 생각은 할까\r\n" + "아주 혹시라도 넌 내가 보고 싶을까\r\n"
						+ "난 왜 니 목소리가 듣고 싶을까\r\n" + "뻔하디 뻔한 노랫말 여서 미안해\r\n" + "미안해도 부디 넌 꼭 들어줬음 해\r\n"
						+ "후회도 미련도 없는 척 떠났지만\r\n" + "이게 내 진심인 걸 꼭 알아줬음 해\r\n" + "우리 함께 듣던 그 노랠 듣고 싶을까\r\n"
						+ "듣고 나서 잠시 날 생각은 할까\r\n" + "아주 혹시라도 넌 내가 보고 싶을까\r\n" + "못난 내 목소리가 듣고 싶을까\r\n"
						+ "말없이 다 전해지는 건 없지 난 말해 지금\r\n" + "몇 년째 나의 favorite one\r\n" + "You the only one yeah\r\n"
						+ "Yes I know 무엇도 달라질 건 없지만\r\n" + "이게 내 진심인 걸 꼭 알아줬음 해\r\n" + "우리 함께 듣던 그 노랠 듣고 싶을까\r\n"
						+ "듣고 나서 잠시 날 생각은 할까\r\n" + "아주 혹시라도 넌 내가 보고 싶을까\r\n" + "난 왜 니 목소리가 듣고 싶을까"));

		list.add(new Music(31, "임영웅", "연애편지", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"노을에 물든 저녁 하늘이\r\n" + "오랜만에 참 좋은 저녁입니다\r\n" + "문득 떠오른 그대 생각에\r\n" + "나지막이 이름을 불러봅니다\r\n"
						+ "나도 몰래 꺼내 본 낡은 수첩엔\r\n" + "그대가 너무도 많아\r\n" + "차마 그립단 말 대신\r\n" + "꽃잎을 넣어 보내며\r\n"
						+ "하얀 종이에 하지 못한 말\r\n" + "아직 그댄 내 고운 사랑입니다\r\n" + "외로이 스쳐 창을 흔드는\r\n" + "바람 소리 쓸쓸한 시간입니다\r\n"
						+ "어둠 만들고 초를 태우며\r\n" + "나지막이 그대를 불러봅니다\r\n" + "나도 몰래 꺼내 본 낡은 사진엔\r\n" + "그대가 너무도 많아\r\n"
						+ "차마 그립단 말 대신\r\n" + "바라본 밤하늘에는\r\n" + "아스라이 먼 작은 별 하나\r\n" + "외로이 홀로 남아 깜박입니다"));

		list.add(new Music(32, "주호", "내가 아니라도", "내가 아니라도", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/97/407/10897407_20220323150744_500.jpg?389545aadd50ead38a260c8438fc5924/melon/resize/282/quality/80/optimize",
				"사랑이었다 별거 없던 내 하루에\r\n" + "빛이 돼준 단한 사람\r\n" + "나보다 나를 더 아껴 주던 너를\r\n" + "그땐 왜 몰랐을까\r\n"
						+ "행복이었다 다시는 없을 것 같던\r\n" + "잠시나마 행복했었다\r\n" + "다른 사람 곁에 있는 널\r\n" + "생각해 본 적 없지만\r\n"
						+ "이젠 너를 보내줘야 할 것 같아\r\n" + "내가 아니라도\r\n" + "눈부시게 사랑받았을 너라서\r\n" + "그 소중한 시간을 나와 함께해 줘서\r\n"
						+ "고마웠어\r\n" + "예쁘고 아름다웠던 너의 그날에\r\n" + "함께했던 그 모든 순간이 행복했어\r\n" + "내 전부였다 무엇도 바꿀 수 없던\r\n"
						+ "우리라서 행복했었다\r\n" + "다른 누구라도\r\n" + "나보다 더 좋은 사람 만나서\r\n" + "이젠 나를 잊고 행복하게 살아\r\n"
						+ "내가 아니라도\r\n" + "눈부시게 사랑받았을 너라서\r\n" + "그 소중한 시간을 나와 함께해 줘서\r\n" + "고마웠어"));

		list.add(new Music(33, "The Kid LAROI, Justin Bieber", "STAY", "Stay", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/106/46/395/10646395_20210707141710_500.jpg?9e8cfc795c83ac2ab6b4f79f967a2a2e/melon/resize/282/quality/80/optimize",
				"I do the same thing I told you\r\n" + "that I never would\r\n" + "I told you I'd change\r\n"
						+ "even when I knew I never could\r\n" + "I know that I can't find\r\n" + "nobody else\r\n"
						+ "as good as you\r\n" + "I need you to stay\r\n" + "need you to stay hey Oh\r\n"
						+ "I get drunk wake up\r\n" + "I'm wasted still\r\n" + "I realize the time\r\n"
						+ "that I wasted here\r\n" + "I feel like you can't\r\n" + "feel the way I feel\r\n"
						+ "Oh I'll be fucked up\r\n" + "if you can't be right here\r\n" + "Oh ooh-woah\r\n"
						+ "Oh ooh-woah ooh-woah\r\n" + "Oh ooh-woah\r\n" + "Oh ooh-woah ooh-woah\r\n"
						+ "Oh ooh-woah\r\n" + "Oh ooh-woah ooh-woah\r\n" + "Oh I'll be fucked up\r\n"
						+ "if you can't be right here\r\n" + "I do the same thing I told you\r\n"
						+ "that I never would\r\n" + "I told you I'd change\r\n" + "even when I knew I never could\r\n"
						+ "I know that I can't find\r\n" + "nobody else\r\n" + "as good as you\r\n"
						+ "I need you to stay\r\n" + "need you to stay hey\r\n" + "I do the same thing I told you\r\n"
						+ "that I never would\r\n" + "I told you I'd change\r\n" + "even when I knew I never could\r\n"
						+ "I know that I can't find\r\n" + "nobody else"));

		list.add(new Music(34, "Charlie Puth", "That's Hilarious", "That's Hilarious", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/44/485/10844485_20220407163235_500.jpg?131e70fda7839bcd0030e219775fff3d/melon/resize/282/quality/80/optimize",
				"Look how all tables,\r\n" + "Look how all the tables have turned,\r\n"
						+ "Guess you’re finally realizing how bad you messed it up\r\n" + "Girl you’re only making,\r\n"
						+ "Girl you’re only making it worse,\r\n"
						+ "When you call like you always do when you want someone\r\n" + "\r\n" + "\r\n"
						+ "Pre-Chorus:\r\n" + "You took away a year,\r\n"
						+ "of my fucking life and I can’t get it back no more\r\n" + "So when I see those tears,\r\n"
						+ "Coming out your eyes I hope it’s me there for\r\n" + "\r\n" + "\r\n" + "Chorus:\r\n"
						+ "You didn’t love when you had me\r\n" + "But now you need me so badly\r\n"
						+ "You can’t be serious\r\n" + "That’s hilarious\r\n" + "Thinking I would still want you\r\n"
						+ "After the things you put me through\r\n" + "Yea You’re delirious\r\n" + "That’s hilarious"));

		list.add(new Music(35, "케이시(Kassy)", "늦은 밤 헤어지긴 너무 아쉬워", "LOVE & HATE", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/60/568/10960568_20220518153132_500.jpg?811fe95ac5d805835e86e59622e95210/melon/resize/282/quality/80/optimize",
				"어쩌면 너도 나와 같은 꿈 꿀까\r\n" + "매일 마주 보며 눈뜨는 하루\r\n" + "늦은 밤 헤어지긴 너무 아쉬워\r\n" + "널 많이 사랑하나 봐\r\n"
						+ "유난히 날씨가 좋은 날\r\n" + "넌 나를 설레이게 해\r\n" + "영화 속에서만 보던 일들이\r\n" + "요즘 내 일상인 듯해\r\n"
						+ "어쩌면 너도 나와 같은 꿈 꿀까\r\n" + "매일 마주 보며 눈뜨는 하루\r\n" + "늦은 밤 헤어지긴 너무 아쉬워\r\n" + "널 많이 사랑하나 봐\r\n"
						+ "오늘 너에게 고백하겠어\r\n" + "취해서 하는 말이 아냐\r\n" + "참아온 진심인 거야\r\n" + "하루 종일 아무것도 안 해도\r\n"
						+ "너랑 있는 게 젤 좋아\r\n" + "달빛도 하늘 아래 우리를 비추고\r\n" + "온 세상이 모두 잠든 것 같아\r\n" + "늦은 밤 헤어지긴 너무 아쉬워\r\n"
						+ "널 많이 사랑하나 봐\r\n" + "네가 살아가는 순간에\r\n" + "그 모든 순간에 내가 있음 해\r\n" + "고마워 내 인생에 나타나줘서\r\n"
						+ "이렇게 날 안아줘서\r\n" + "오늘 너에게 고백하겠어"));

		list.add(new Music(36, "임영웅", "보금자리", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"그대 사랑이 나였음 좋겠다\r\n" + "아무것도 필요 없어요\r\n" + "든든한 품에 안겨 잠들고 싶어라\r\n" + "내 사랑의 보금자리\r\n"
						+ "아무것도 바라지 않아요\r\n" + "당신만 있으면 돼\r\n" + "한 눈 팔지 않고 사랑할래요\r\n" + "돈도 필요 없어 백도 필요 없어\r\n"
						+ "당신만 있으면 돼\r\n" + "그대 사랑이 나였음 좋겠다\r\n" + "아무것도 필요 없어요\r\n" + "든든한 품에 안겨 잠들고 싶어라\r\n"
						+ "내 사랑의 보금자리\r\n" + "아무것도 바라지 않아요\r\n" + "당신만 있으면 돼\r\n" + "한 눈 팔지 않고 사랑할래요\r\n"
						+ "돈도 필요 없어 백도 필요 없어\r\n" + "당신만 있으면 돼\r\n" + "아무것도 바라지 않아요\r\n" + "당신만 있으면 돼\r\n"
						+ "한 눈 팔지 않고 사랑할래요\r\n" + "돈도 필요 없어 백도 필요 없어\r\n" + "당신만 있으면 돼\r\n" + "당신만 있으면 돼"));

		list.add(new Music(37, "임영웅", "사랑해요 그대를", "IM HERO", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/23/444/10923444_20220502140600_500.jpg?5bd42dcc031a23cd1cae99ae37a606aa/melon/resize/282/quality/80/optimize",
				"너무나 고마운 사람\r\n" + "너무나 따뜻한 사람\r\n" + "한 번도 잊어본 적 없는\r\n" + "내 마음속에 그 사람\r\n" + "나 그대 생각만 해도\r\n"
						+ "가슴이 뭉클해지고\r\n" + "그런 당신 내 곁에 있어\r\n" + "나는 행복한 사람\r\n" + "그대는 나만의 사랑\r\n" + "그대는 나만의 행복\r\n"
						+ "세월 가도 영원히\r\n" + "당신은 나만의 사랑\r\n" + "사랑해요 그대를\r\n" + "사랑해요 그대를\r\n" + "이 생명 다할 때까지\r\n"
						+ "당신은 내 사랑\r\n" + "사랑해요 그대를\r\n" + "사랑해요 그대를\r\n" + "이 생명 다할 때까지\r\n" + "당신은 내사랑\r\n"
						+ "그대는 나만의 사랑\r\n" + "그대는 나만의 행복\r\n" + "세월 가도 영원히\r\n" + "당신은 나만의 사랑"));

		list.add(new Music(38, "세븐틴", "Dar+ing", "SEVENTEEN 4th Album 'Face the Sun'", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/22/231/10922231_20220527120653_500.jpg?d4668bd274949f814ae2ccadee6f42eb/melon/resize/282/quality/80/optimize",
				"You know without you I’m so lonely\r\n" + "When you’re not here 911 calling\r\n"
						+ "Into your heat again I’m diving\r\n" + "Darling you Darling you baby\r\n" + "\r\n"
						+ "Fighting round in circles where is the way out\r\n"
						+ "‘Cause I know that our love was hotter than the sun\r\n"
						+ "Yeah the taste of this tequila I’m drinking now\r\n" + "Isn’t bitter than my heart\r\n"
						+ "\r\n" + "(If you know this)\r\n" + "I want to know our problem blood type or DNA\r\n"
						+ "Friends see my feed and worry, do you babe? Yeah\r\n"
						+ "Been waiting for your call every night\r\n" + "But I can’t wait no more\r\n"
						+ "Dialing you-u-u, sorry darling you\r\n" + "\r\n" + "You know without you I’m so lonely\r\n"
						+ "When you’re not here 911 calling\r\n" + "Into your heat again I’m diving\r\n"
						+ "Darling you Darling you baby\r\n" + "\r\n" + "You know without you I’m so lonely\r\n"
						+ "If you won’t be here 911 calling\r\n" + "Falling to you I’m always diving\r\n"
						+ "Darling you Darling you baby\r\n" + "\r\n" + "Darling with me under the sun\r\n"
						+ "I know that you’re my one"));

		list.add(new Music(39, "방탄소년단", "Dynamite", "Dynamite (DayTime Version)", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/104/79/150/10479150_20200918102847_500.jpg?45d847d7dc536eecebd648786c2ea37c/melon/resize/282/quality/80/optimize",
				"Cos ah ah\r\n" + "I’m in the stars tonight\r\n" + "So watch me bring the fire\r\n"
						+ "and set the night alight\r\n" + "Shoes on get up in the morn\r\n"
						+ "Cup of milk let’s rock and roll\r\n" + "King Kong kick the drum\r\n"
						+ "rolling on like a rolling stone\r\n" + "Sing song when I’m walking home\r\n"
						+ "Jump up to the top LeBron\r\n" + "Ding dong call me on my phone\r\n"
						+ "Ice tea and a game of ping pong\r\n" + "This is getting heavy\r\n"
						+ "Can you hear the bass boom\r\n" + "I’m ready\r\n" + "Life is sweet as honey\r\n"
						+ "Yeah this beat cha ching\r\n" + "like money\r\n" + "Disco overload I’m into\r\n"
						+ "that I’m good to go\r\n" + "I'm diamond you know I glow up\r\n" + "Hey so let’s go\r\n"
						+ "Cos ah ah\r\n" + "I’m in the stars tonight\r\n" + "So watch me bring the fire\r\n"
						+ "and set the night alight\r\n" + "Shining through the city\r\n"
						+ "with a little funk and soul\r\n" + "So I’mma light it up\r\n" + "like dynamite woah\r\n"
						+ "Bring a friend join the crowd\r\n" + "Whoever wanna come along\r\n"
						+ "Word up talk the talk\r\n" + "just move like we off the wall\r\n"
						+ "Day or night the sky’s alight\r\n" + "So we dance to the break of dawn\r\n"
						+ "Ladies and gentlemen\r\n" + "I got the medicine\r\n" + "so you should keep ya\r\n"
						+ "eyes on the ball huh\r\n" + "This is getting heavy\r\n" + "Can you hear the bass boom"));

		list.add(new Music(40, "태연 (TAEYEON)", "Weekend", "Weekend", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/106/45/654/10645654_20210706155154_500.jpg?25112f5d01b0377eff75df038c9b0c9b/melon/resize/282/quality/80/optimize",
				"가장 가까운 바다\r\n" + "혼자만의 영화관\r\n" + "그냥 이끌리는 대로 해도 괜찮으니까\r\n" + "Every morning 울린\r\n"
						+ "Beep beep beep beep 소리\r\n" + "귀에 윙윙윙 맴도는\r\n" + "나를 재촉하던 모닝콜 없이 일어나\r\n"
						+ "Cheese cake 한 입\r\n" + "유리컵 한가득\r\n" + "내린 커피 한 잔\r\n" + "아이스로 할래 아주 여유롭게\r\n"
						+ "문득 시곌 보니\r\n" + "벌써 시간은 열두시\r\n" + "그래도 아주 느긋해\r\n" + "그리곤 하품 한 번\r\n" + "한껏 기지개도 켜고\r\n"
						+ "생각해 오늘 뭐 할까\r\n" + "창문 너머 계절에 시선이 닿은 그 순간\r\n" + "쏟아지는 햇살 내 맘을 두드려\r\n"
						+ "내게 손짓하는 싱그러운 바람 타고서\r\n" + "떠나볼래 When the weekend comes\r\n" + "I can do whatever I want\r\n"
						+ "바람 따라 흩어진 cloud\r\n" + "더 자유롭게 we can go\r\n" + "가장 가까운 바다\r\n" + "혼자만의 영화관\r\n"
						+ "그냥 이끌리는 대로 해도 괜찮으니까\r\n" + "훌쩍 떠나보는 drive\r\n" + "뚜벅 걸어도 좋아"));

		list.add(new Music(41, "aespa", "Next Level", "Next Level", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/106/09/232/10609232_20210517155130_500.jpg?eda48bcb5e6a2b2a9f40fc2a0463f47f/melon/resize/282/quality/80/optimize",
				"I’m on the Next Level Yeah\r\n" + "절대적 룰을 지켜\r\n" + "내 손을 놓지 말아\r\n" + "결속은 나의 무기\r\n" + "광야로 걸어가\r\n"
						+ "알아 네 Home ground\r\n" + "위협에 맞서서\r\n" + "제껴라 제껴라 제껴라\r\n" + "\r\n" + "상상도 못한 Black out\r\n"
						+ "유혹은 깊고 진해\r\n" + "(Too hot too hot)\r\n" + "맞잡은 손을 놓쳐\r\n" + "난 절대 포기 못해\r\n" + "\r\n"
						+ "I’m on the Next Level\r\n" + "저 너머의 문을 열어\r\n" + "Next Level\r\n" + "널 결국엔 내가 부셔\r\n"
						+ "Next Level\r\n" + "KOSMO에 닿을 때까지\r\n" + "Next Level\r\n" + "제껴라 제껴라 제껴라\r\n" + "\r\n"
						+ "La la la la la la\r\n" + "La la la la la la\r\n" + "La la la la la la\r\n"
						+ "La la la la la"));

		list.add(new Music(42, "방탄소년단", "Butter", "Butter", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/106/12/483/10612483_20210521111412_500.jpg?1c2769f71815b15741622b61a75fb530/melon/resize/282/quality/80/optimize",
				"Smooth like butter\r\n" + "Like a criminal undercover\r\n" + "Gon’ pop like trouble\r\n"
						+ "Breakin’ into your heart like that\r\n" + "\r\n" + "Cool shade stunner\r\n"
						+ "Yeah I owe it all to my mother\r\n" + "Hot like summer\r\n"
						+ "Yeah I’m makin’ you sweat like that\r\n" + "\r\n" + "Break it down\r\n" + "\r\n"
						+ "Oh when I look in the mirror\r\n" + "I’ll melt your heart into 2\r\n"
						+ "I got that superstar glow so\r\n" + "Do the boogie like\r\n" + "\r\n"
						+ "Side step right left to my beat (heartbeat)\r\n" + "High like the moon rock with me baby\r\n"
						+ "Know that I got that heat\r\n" + "Let me show you ‘cause talk is cheap\r\n"
						+ "Side step right left to my beat (heartbeat)\r\n" + "Get it, let it roll\r\n" + "\r\n"
						+ "Smooth like butter\r\n" + "Pull you in like no other\r\n" + "Don’t need no Usher\r\n"
						+ "To remind me you got it bad\r\n" + "\r\n" + "Ain’t no other\r\n"
						+ "That can sweep you up like a robber\r\n" + "Straight up, I got ya\r\n"
						+ "Makin’ you fall like that\r\n" + "\r\n" + "Break it down\r\n" + ""));

		list.add(new Music(43, "주시크 (Joosiq)", "너를 생각해", "너를 생각해", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/107/16/399/10716399_20210916173429_500.jpg?d0ffad437e074395ff77646d920ece94/melon/resize/282/quality/80/optimize",
				"너를 들려주고 싶었어\r\n" + "이 노랠 만들 때\r\n" + "아마 니가 정말 많이 좋아할꺼야\r\n" + "이젠 내겐 니가 없어서\r\n" + "나 혼자 불러도\r\n"
						+ "혹시 듣게 되면 그게 니 얘기라고\r\n" + "난 노랠 만들 땐\r\n" + "늘 너를 생각해\r\n" + "어딘가 혼자 진지한 표정\r\n"
						+ "고개를 끄덕거리고 나선\r\n" + "항상 흥얼거리며 따라 불렀어\r\n" + "나를 보며 신나있던 너에게\r\n" + "불러주고 싶던 노래를\r\n"
						+ "왜 이제야 겨우 완성했을까\r\n" + "이 노랜 널 사랑한다는 내 얘기가\r\n" + "잔뜩 들어갔어야 하는 노랜데\r\n" + "너를 들려주고 싶었어\r\n"
						+ "이 노랠 만들 때\r\n" + "아마 니가 정말 많이 좋아할꺼야\r\n" + "이젠 내겐 니가 없어서\r\n" + "나 혼자 불러도\r\n"
						+ "혹시 듣게 되면 그게 니 얘기라고\r\n" + "니가 자주 가곤했던 카페에\r\n" + "이 노래가 나올 때까지\r\n" + "니 친구가 따라 부를 때까지\r\n"
						+ "이 노랠 유명해지게 계속 불러서\r\n" + "나는 너에게로 꼭 닿고 말거야\r\n" + "너를 들려주고 싶었어"));

		list.add(new Music(44, "YENA (최예나)", "SMILEY (Feat. BIBI)", "ˣ‿ˣ (SMiLEY)", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/42/611/10842611_20220117110002_500.jpg?943fdb8574f4aacd81b42d9668cdf52a/melon/resize/282/quality/80/optimize",
				"울지 마 울지 마\r\n" + "어린아이같이\r\n" + "웃는 게 웃는 게\r\n" + "이기는 거라고\r\n" + "You are so cute\r\n"
						+ "You are so dumb\r\n" + "네가 하는 말이\r\n" + "오늘따라 듣기 싫어\r\n" + "하늘을 한 번 쳐다보고\r\n" + "내가 꾹 참고\r\n"
						+ "맘을 다 잡고\r\n" + "네게 밝게 웃어줄게\r\n" + "And I say Hey\r\n" + "I’m gonna make it\r\n"
						+ "Smile Smile Smile away\r\n" + "예쁘게 웃고 넘겨버릴래\r\n" + "Just Smile away\r\n"
						+ "Just Smile away\r\n" + "아픔 슬픔 외로움 잊게\r\n" + "I say hey\r\n"
						+ "I never wanna Cry Cry Cry all day\r\n" + "갑자기 눈물이 차오를 땐\r\n" + "Just Smile away\r\n"
						+ "Just Smile away\r\n" + "안녕이라 말할래\r\n" + "With my Smiley face\r\n" + "비웃을 때 빼고\r\n"
						+ "내 입꼬리는 Chillin’\r\n" + "나빠야지 살아남지 넌 뭐해\r\n" + "귀엽고 예쁘면 장땡이냐 근데\r\n" + "널 보고 있으니까 기분이가 좋네"));

		list.add(new Music(45, "케이시 (Kassy)", "언제나 사랑해", "조영수 리메이크 프로젝트 Part.2", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/57/681/10857681_20220204162442_500.jpg?14a009765b3053f6c482eab7061b58c7/melon/resize/282/quality/80/optimize",
				"둘이 손잡고 걸을 때\r\n" + "마주 보며 또 웃을 때\r\n" + "사랑한다 말하지 않아도 알아\r\n" + "널 만나러 가는 길에\r\n"
						+ "내 입가에 늘 환한 미소만이\r\n" + "흐르고 있어\r\n" + "사랑해 너를 사랑해\r\n" + "눈물 나도록 사랑해\r\n" + "저기 밤하늘의 별보다\r\n"
						+ "보석보다 네가 더 소중해\r\n" + "얼마나 내가 얼마나 너를 사랑하는지\r\n" + "내 모든 걸 너에게 줄게\r\n" + "속상하고 힘이 들 때\r\n"
						+ "열이 나고 아파할 때\r\n" + "옆에서 늘 힘이 돼준 사람 너야\r\n" + "집에 돌아오는 길에\r\n" + "내 귓가엔 늘 너의 음성만이\r\n"
						+ "흐르고 있어\r\n" + "사랑해 너를 사랑해\r\n" + "눈물 나도록 사랑해\r\n" + "저기 밤하늘의 별보다\r\n" + "보석보다 네가 더 소중해\r\n"
						+ "얼마나 내가 얼마나 너를 사랑하는지\r\n" + "내 모든 걸 너에게 줄게\r\n" + "세월 지나 많이 변했을 때\r\n" + "미운 나의 손을 잡아줄 사람\r\n"
						+ "먼 훗날 아주 먼 훗날\r\n" + "우리 눈 감는 그날에\r\n" + "나를 사랑해 준 너에게 고맙다고"));

		list.add(new Music(46, "성시경", "너의 모든 순간", "별에서 온 그대 OST Part.7", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm/album/images/022/32/505/2232505_500.jpg/melon/resize/282/quality/80/optimize",
				"이윽고 내가 한눈에\r\n" + "너를 알아봤을 때\r\n" + "모든 건 분명 달라지고 있었어\r\n" + "내 세상은 널 알기 전과 후로 나뉘어\r\n"
						+ "니가 숨 쉬면 따스한 바람이 불어와\r\n" + "니가 웃으면 눈부신 햇살이 비춰\r\n" + "거기 있어줘서 그게 너라서\r\n"
						+ "가끔 내 어깨에 가만히 기대주어서\r\n" + "나는 있잖아 정말 빈틈없이 행복해\r\n" + "너를 따라서 시간은 흐르고 멈춰\r\n"
						+ "물끄러미 너를 들여다 보곤 해\r\n" + "그것 말고는 아무것도 할 수 없어서\r\n" + "너의 모든 순간 그게\r\n" + "나였으면 좋겠다\r\n"
						+ "생각만 해도 가슴이 차올라\r\n" + "나는 온통 너로\r\n" + "보고 있으면 왠지 꿈처럼 아득한 것\r\n" + "몇 광년 동안 날 향해 날아온 별빛\r\n"
						+ "또 지금의 너\r\n" + "거기 있어줘서 그게 너라서"));

		list.add(new Music(47, "주시크 (Joosiq)", "아무래도 난", "아무래도 난", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/03/658/10903658_20220329185034_500.jpg?c3378c711c1510089eb2e54aa93c5836/melon/resize/282/quality/80/optimize",
				"아무렇지 않게 내 하루가 또\r\n" + "지나갈 쯤에 문득\r\n" + "네가 없다는 게 익숙해진 내가\r\n" + "낯설어지곤 해 yeah\r\n"
						+ "이제와 너 없는 난 의미 없다고\r\n" + "되돌릴 수 없는 우리겠지만\r\n" + "네가 좋아했던 그 노랠 우연히\r\n" + "듣게 됐어 아무래도 난\r\n"
						+ "Baby I Need You\r\n" + "좀 늦었겠지만\r\n" + "다시 하고 싶어\r\n" + "여전히 I Need you\r\n" + "Need You\r\n"
						+ "좀 어렵겠지만\r\n" + "너 없인 안돼 난\r\n" + "너도 알잖아\r\n" + "Baby I need you now\r\n"
						+ "Baby I need you now\r\n" + "Baby I need you now\r\n" + "몇 곡의 노래로 너를 불렀을까\r\n"
						+ "너도 들었겠지만\r\n" + "아직도 궁금해\r\n" + "내가 없이 보낸\r\n" + "너의 지금은 어때\r\n" + "이제와 너 없는 난 의미 없다고\r\n"
						+ "되돌릴 수 없는 우리겠지만\r\n" + "네가 좋아했던 그 노랠 우연히\r\n" + "불러 봤어 아무래도 난\r\n" + "Baby I Need You\r\n"
						+ "좀 늦었겠지만\r\n" + "다시 하고 싶어"));

		list.add(new Music(48, "아이유", "드라마", "조각집", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/108/27/816/10827816_20211229143632_500.jpg?5212701ba136b287d5c446d6f504451f/melon/resize/282/quality/80/optimize",
				"나도 한때는 그이의 손을 잡고\r\n" + "내가 온 세상 주인공이 된 듯\r\n" + "꽃송이의 꽃잎 하나하나까지\r\n" + "모두 날 위해 피어났지\r\n" + "\r\n"
						+ "올림픽대로 뚝섬 유원지\r\n" + "서촌 골목골목 예쁜 식당\r\n" + "나를 휘청거리게 만든\r\n" + "주옥같은 대사들\r\n" + "\r\n"
						+ "다시 누군가 사랑할 수 있을까\r\n" + "예쁘다는 말 들을 수 있을까\r\n" + "하루 단 하루만 기회가 온다면\r\n" + "죽을힘을 다해 빛나리\r\n"
						+ "\r\n" + "언제부턴가 급격하게\r\n" + "단조로 바뀌던 배경음악\r\n" + "조명이 꺼진 세트장에\r\n" + "혼자 남겨진 나는"));

		list.add(new Music(49, "볼빨간사춘기", "Seoul", "Seoul", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm2/album/images/109/26/502/10926502_20220420071020_500.jpg?8c6377ae72a311f6c1d593c757d1361b/melon/resize/282/quality/80/optimize",
				"Seoul 처음 만난 낯선 도시에서\r\n" + "사람들 사이에 빛이 나는\r\n" + "기타를 멘 멋진 소년과 yeah\r\n" + "사랑에 빠진 Love Story\r\n"
						+ "들어볼래 지나치게도\r\n" + "소설 같은 이야기일 거야\r\n" + "Maybe Someday\r\n" + "꽃잎이 떨어지는 그날에\r\n"
						+ "우리가 만난 그곳에서\r\n" + "멀리서 기타 소리가 들리면 나\r\n" + "너를 위해 노랠 부를 거야\r\n" + "City of light\r\n"
						+ "빛이 가득한 이 도시에서\r\n" + "눈을 반짝이며 꿈을 꾸는\r\n" + "마이크를 쥔 멋진 소녀와\r\n" + "사랑에 빠진 Love Story\r\n"
						+ "Maybe Someday\r\n" + "꽃잎이 떨어지는 그날에\r\n" + "우리가 만난 그곳에서\r\n" + "멀리서 기타 소리가 들리면 나\r\n"
						+ "너를 위해 노랠 부를 거야\r\n" + "언젠가 사랑했던 그 도시에서\r\n" + "내 목소릴 기억한다면\r\n" + "그때 우리 만나자 my Seoul"));

		list.add(new Music(50, "방탄소년단", "봄날", "YOU NEVER WALK ALONE", "https://drive.google.com/uc?export=download&id=1gkT-uuSgvHpTTZ3CsJthwD60eTHjdl5T",
				"https://cdnimg.melon.co.kr/cm/album/images/100/37/969/10037969_500.jpg?df3750c6152ad5e19ea6773a5faf71ba/melon/resize/282/quality/80/optimize",
				"보고 싶다\r\n" + "이렇게 말하니까 더 보고 싶다\r\n" + "너희 사진을 보고 있어도\r\n" + "보고 싶다\r\n" + "너무 야속한 시간\r\n"
						+ "나는 우리가 밉다\r\n" + "이젠 얼굴 한번 보는 것 조차\r\n" + "힘들어진 우리가\r\n" + "여긴 온통 겨울 뿐이야\r\n"
						+ "8월에도 겨울이 와\r\n" + "마음은 시간을 달려가네\r\n" + "홀로 남은 설국열차\r\n" + "니 손 잡고 지구 반대편까지 가\r\n"
						+ "겨울을 끝내고파\r\n" + "그리움들이 얼마나\r\n" + "눈처럼 내려야 그 봄날이 올까\r\n" + "Friend\r\n" + "허공을 떠도는\r\n"
						+ "작은 먼지처럼 작은 먼지처럼\r\n" + "날리는 눈이 나라면\r\n" + "조금 더 빨리\r\n" + "네게 닿을 수 있을 텐데\r\n"
						+ "눈꽃이 떨어져요\r\n" + "또 조금씩 멀어져요\r\n" + "보고 싶다 보고 싶다\r\n" + "보고 싶다 보고 싶다\r\n" + "얼마나 기다려야\r\n"
						+ "또 몇 밤을 더 새워야\r\n" + "널 보게 될까 널 보게 될까\r\n" + "만나게 될까 만나게 될까\r\n" + "추운 겨울 끝을 지나\r\n"
						+ "다시 봄날이 올 때까지\r\n" + "꽃 피울 때까지\r\n" + "그곳에 좀 더 머물러줘\r\n" + "머물러줘\r\n" + "니가 변한 건지\r\n"
						+ "니가 변한 건지\r\n" + "아니면 내가 변한 건지\r\n" + "내가 변한 건지\r\n" + "이 순간 흐르는 시간조차 미워\r\n"
						+ "우리가 변한 거지 뭐\r\n" + "모두가 그런 거지 뭐\r\n" + "그래 밉다 니가 넌 떠났지만\r\n" + "단 하루도 너를\r\n"
						+ "잊은 적이 없었지 난\r\n" + "솔직히 보고 싶은데\r\n" + "이만 너를 지울게\r\n" + "그게 널 원망하기보단\r\n" + "덜 아프니까\r\n"
						+ "시린 널 불어내 본다\r\n" + "연기처럼 하얀 연기처럼\r\n" + "말로는 지운다 해도\r\n" + "사실 난 아직 널 보내지 못하는데\r\n"
						+ "눈꽃이 떨어져요\r\n" + "또 조금씩 멀어져요\r\n" + "보고 싶다 보고 싶다\r\n" + "보고 싶다 보고 싶다\r\n" + "얼마나 기다려야\r\n"
						+ "또 몇 밤을 더 새워야\r\n" + "널 보게 될까 널 보게 될까\r\n" + "만나게 될까 만나게 될까"));

		return list;
	}

}
