package Q1;

import java.util.Random;

public class Vocabulary {
	private static final String[] words = {
			 "about", "above", "across", "after", "again", "against", "along", "already", "also", "although", "always", "among", "and", "another", "any", "anyone", "anything","anywhere", "apart", "appear", "apply",
			 "back", "bad", "because", "become", "bed", "before", "behind", "being", "believe", "below", "beside", "besides", "best", "between", "big", "bird", "bit", "black", "bless", "blind", "blood", "blow", "blue", "board", "body", "book", "born", "both", "bottom",
			 "cannot", "capital", "center", "century", "certain", "chair", "change", "chance", "chapter", "character", "charge", "chart", "chase", "cheap", "check", "cheese", "chest", "chicken", "child",
			 "day", "dead", "deal", "dear", "death", "debt", "decide", "declare", "decline", "decorate", "decrease", "deep", "defeat", 
			 "each", "eager", "early", "earn", "earth", "east", "easy", "eat", "edge", "education", "effect", "effort", "egg", "eight", "either", "electric", "elegant", "element",
			 "face", "fact", "factory", "fail", "fair", "family", "famous", "fan", "far", "farm", "fashion", "fast", "fat", "father", "fault", "favor", "fear", "february",
			 "game", "garden", "garage", "garbage", "garden", "gas", "gate", "gather", "general", "generation", "generous", "gentle", "geography", "get", "ghost", "giant",
			 "hair", "half", "hand", "happen", "happy", "hat", "have", "head", "health", "hear", "heart", "heat", "heavy", "height", "heir", "hello", "help",
			 "idea", "important", "include", "indeed", "information", "interest", "introduce", "iron", "island",
			 "just", "jump",
			 "keep", "key", "kill", "kind", "king", "kiss",
			 "land", "large", "last", "late", "laugh", "law", "learn", "letter", "library", "life", "light","like", "line", "lip", "listen", "little", "live",
			 "man", "many", "map", "mark", "marry", "matter", "may", "mean", "meat", "meet", "member", "memory", "mention", "message", "middle", "might", "mile", "mind",
			 "name", "nation", "near", "nearly", "necessary", "neck", "need", "never", "news",
			 "office", "often", "old", "one", "only", "open", "opinion", "opposite","order", "other", "our", "out", "over", "own",
			 "paper", "parent", "part", "pass", "past", "pay", "peace", "people", "perhaps", "person", "pet", "picture", "place", "plan", "plant", "plate", "play", "pleasure", "please", "point",
			 "question", "quick", "quiet",
			 "race", "rain", "raise", "ran", "range", "rapid", "rare", "rate", "read", "ready ", "real", "reason", "receive", "red", "reduce", "refer", "reflect", "refuse", "regard", "region",
			 "same", "sand", "say", "scene", "school", "science", "sea", "seat", "see", "seem ", "seem", "seem", "sell", "send", "sense", "sentence", "serious", "serve", "set", "seven",
			 "table", "take", "talk", "tall", "taste", "teach", "team", "tell", "ten", "tent ", "term", "test", "thank", "that", "the", "their", "them", "then", "there", "these",
			 "under", "understand", "uniform", "unit", "university", "up", "upon", "use", "usual",
			 "very ", "value", "van", "variety", "very", "view", "visit", "voice", "volume", "vote", 
			 "walk ", "want", "war", "warm", "wash", "watch", "water", "way", "we", "week", "well ", 
			 "year", "yellow", "yes", "yet", "you", "young ", "zero"}; 
	 
	public static String getRandWord() {
		Random r = new Random();
		int ind = r.nextInt(words.length);
		return words[ind];
	}
}