package ksu4040e064.finaltest;


public final class MyData {
	// 以陣列儲存4個Park物件
	public static final Park[] PARKS = {
			new Park("臺灣桃園國際機場",R.drawable.tpe,
					"臺灣桃園國際機場簡稱桃園國際機場、桃園機場，是位於中華民國桃園市大園區的民航機場，為中華民國的國際客運主要出入地及國門。"),
			new Park("臺北國際航空站", R.drawable.tsa,
					"臺北松山機場是位於中華民國臺北市松山區的機場，也是臺灣第一座機場，啟用於1936年，與桃園機場同為臺北都會區的聯外機場，因其所在地又別稱為松山機場或臺北機場。"),
			new Park("臺南航空站",	R.drawable.tnn,
					"臺南航空站位於臺灣臺南市，為軍民合用機場，也是雲嘉南地區第一座聯外機場。場站目前由軍方管理，內部包含了軍方的：中華民國空軍臺南基地，以及民用部分的：交通部民用航空局臺南航空站，同時也是航空器維修商亞洲航空總部與維修基地。"),
			new Park("臺中航空站",	R.drawable.rmq,
					"臺中清泉崗機場位於中華民國臺中市，為臺灣中部唯一的聯外機場，場區主要位於沙鹿區，亦涵蓋清水區、神岡區、大雅區等區，占地約1,800公頃。該機場在冷戰時期曾經純為中華民國空軍和駐台美軍的軍用機場，之後因應臺中水湳機場的關閉而轉型為軍民合用機場，但場區仍由軍方管理。"),
			new Park("花蓮航空站",R.drawable.hun,
					"花蓮機場是一座位於臺灣花蓮縣新城鄉的機場，場區位在花蓮市中心北方，橫亙整個新城鄉最南部。該機場為一軍民合用機場，也是宜花東地區第一座國際機場，主要由中華民國空軍管理，分為山側的空軍佳山基地、以及海側的空軍花蓮基地；民用部分位於海側，稱為花蓮航空站，由中華民國交通部民用航空局經營。"),
			new Park("高雄國際航空站", R.drawable.khh,
					"高雄國際機場是位於中華民國高雄市小港區的一座民用機場，有時又因其座落位置而別稱為小港機場或高雄小港機場，為南臺灣的主要聯外國際機場、以及國際客運出入吞吐地，也是臺灣第二大國際機場，總面積為2.44平方公里。") };

	static class Park {
		private String name; // 機場名稱
		private int imageId; //機場圖片resource id
		private String description; // 機場描述

		public Park() {

		}

		public Park(String name, int imageId, String description) {
			super();
			this.name = name;
			this.imageId = imageId;
			this.description = description;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getImageId() {
			return imageId;
		}

		public void setImageId(int imageId) {
			this.imageId = imageId;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}
}
