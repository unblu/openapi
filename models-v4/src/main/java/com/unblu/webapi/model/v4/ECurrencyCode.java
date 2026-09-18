
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;ISO 4217&lt;/a&gt; currency codes.
 */
public enum ECurrencyCode {

	/**
	 * AED: UAE dirham (United Arab Emirates)
	 */
	AED("AED"),

	/**
	 * AFN: Afghan afghani (Afghanistan)
	 */
	AFN("AFN"),

	/**
	 * ALL: Albanian lek (Albania)
	 */
	ALL("ALL"),

	/**
	 * AMD: Armenian dram (Armenia)
	 */
	AMD("AMD"),

	/**
	 * ANG: Netherlands Antillean guilder (Curacao, Sint Maarten)
	 */
	ANG("ANG"),

	/**
	 * AOA: Angolan kwanza (Angola)
	 */
	AOA("AOA"),

	/**
	 * ARS: Argentine peso (Argentina)
	 */
	ARS("ARS"),

	/**
	 * AUD: Australian dollar (Australia)
	 */
	AUD("AUD"),

	/**
	 * AWG: Aruban florin (Aruba)
	 */
	AWG("AWG"),

	/**
	 * AZN: Azerbaijani manat (Azerbaijan)
	 */
	AZN("AZN"),

	/**
	 * BAM: Bosnia and Herzegovina convertible mark (Bosnia and Herzegovina)
	 */
	BAM("BAM"),

	/**
	 * BBD: Barbados dollar (Barbados)
	 */
	BBD("BBD"),

	/**
	 * BDT: Bangladeshi taka (Bangladesh)
	 */
	BDT("BDT"),

	/**
	 * BGN: Bulgarian lev (Bulgaria)
	 */
	BGN("BGN"),

	/**
	 * BHD: Bahraini dinar (Bahrain)
	 */
	BHD("BHD"),

	/**
	 * BIF: Burundian franc (Burundi)
	 */
	BIF("BIF"),

	/**
	 * BMD: Bermudian dollar (Bermuda)
	 */
	BMD("BMD"),

	/**
	 * BND: Brunei dollar (Brunei)
	 */
	BND("BND"),

	/**
	 * BOB: Boliviano (Bolivia)
	 */
	BOB("BOB"),

	/**
	 * BOV: Bolivian Mvdol, a funds code used for accounting in Bolivia
	 */
	BOV("BOV"),

	/**
	 * BRL: Brazilian real (Brazil)
	 */
	BRL("BRL"),

	/**
	 * BSD: Bahamian dollar (Bahamas)
	 */
	BSD("BSD"),

	/**
	 * BTN: Bhutanese ngultrum (Bhutan)
	 */
	BTN("BTN"),

	/**
	 * BWP: Botswana pula (Botswana)
	 */
	BWP("BWP"),

	/**
	 * BYN: Belarusian ruble (Belarus)
	 */
	BYN("BYN"),

	/**
	 * BZD: Belize dollar (Belize)
	 */
	BZD("BZD"),

	/**
	 * CAD: Canadian dollar (Canada)
	 */
	CAD("CAD"),

	/**
	 * CDF: Congolese franc (Democratic Republic of the Congo)
	 */
	CDF("CDF"),

	/**
	 * CHE: WIR euro, a complementary currency issued in Switzerland
	 */
	CHE("CHE"),

	/**
	 * CHF: Swiss franc (Switzerland, Liechtenstein)
	 */
	CHF("CHF"),

	/**
	 * CHW: WIR franc, a complementary currency issued in Switzerland
	 */
	CHW("CHW"),

	/**
	 * CLF: Unidad de Fomento, an inflation-indexed funds code used in Chile
	 */
	CLF("CLF"),

	/**
	 * CLP: Chilean peso (Chile)
	 */
	CLP("CLP"),

	/**
	 * CNY: Renminbi yuan (China)
	 */
	CNY("CNY"),

	/**
	 * COP: Colombian peso (Colombia)
	 */
	COP("COP"),

	/**
	 * COU: Unidad de Valor Real, an inflation-indexed funds code used in Colombia
	 */
	COU("COU"),

	/**
	 * CRC: Costa Rican colon (Costa Rica)
	 */
	CRC("CRC"),

	/**
	 * CUP: Cuban peso (Cuba)
	 */
	CUP("CUP"),

	/**
	 * CVE: Cape Verdean escudo (Cabo Verde)
	 */
	CVE("CVE"),

	/**
	 * CZK: Czech koruna (Czechia)
	 */
	CZK("CZK"),

	/**
	 * DJF: Djiboutian franc (Djibouti)
	 */
	DJF("DJF"),

	/**
	 * DKK: Danish krone (Denmark, Faroe Islands, Greenland)
	 */
	DKK("DKK"),

	/**
	 * DOP: Dominican peso (Dominican Republic)
	 */
	DOP("DOP"),

	/**
	 * DZD: Algerian dinar (Algeria)
	 */
	DZD("DZD"),

	/**
	 * EGP: Egyptian pound (Egypt)
	 */
	EGP("EGP"),

	/**
	 * ERN: Eritrean nakfa (Eritrea)
	 */
	ERN("ERN"),

	/**
	 * ETB: Ethiopian birr (Ethiopia)
	 */
	ETB("ETB"),

	/**
	 * EUR: Euro (the euro area)
	 */
	EUR("EUR"),

	/**
	 * FJD: Fiji dollar (Fiji)
	 */
	FJD("FJD"),

	/**
	 * FKP: Falkland Islands pound (Falkland Islands)
	 */
	FKP("FKP"),

	/**
	 * GBP: Pound sterling (United Kingdom)
	 */
	GBP("GBP"),

	/**
	 * GEL: Georgian lari (Georgia)
	 */
	GEL("GEL"),

	/**
	 * GHS: Ghanaian cedi (Ghana)
	 */
	GHS("GHS"),

	/**
	 * GIP: Gibraltar pound (Gibraltar)
	 */
	GIP("GIP"),

	/**
	 * GMD: Gambian dalasi (Gambia)
	 */
	GMD("GMD"),

	/**
	 * GNF: Guinean franc (Guinea)
	 */
	GNF("GNF"),

	/**
	 * GTQ: Guatemalan quetzal (Guatemala)
	 */
	GTQ("GTQ"),

	/**
	 * GYD: Guyanese dollar (Guyana)
	 */
	GYD("GYD"),

	/**
	 * HKD: Hong Kong dollar (Hong Kong)
	 */
	HKD("HKD"),

	/**
	 * HNL: Honduran lempira (Honduras)
	 */
	HNL("HNL"),

	/**
	 * HTG: Haitian gourde (Haiti)
	 */
	HTG("HTG"),

	/**
	 * HUF: Hungarian forint (Hungary)
	 */
	HUF("HUF"),

	/**
	 * IDR: Indonesian rupiah (Indonesia)
	 */
	IDR("IDR"),

	/**
	 * ILS: Israeli new shekel (Israel)
	 */
	ILS("ILS"),

	/**
	 * INR: Indian rupee (India)
	 */
	INR("INR"),

	/**
	 * IQD: Iraqi dinar (Iraq)
	 */
	IQD("IQD"),

	/**
	 * IRR: Iranian rial (Iran)
	 */
	IRR("IRR"),

	/**
	 * ISK: Icelandic krona (Iceland)
	 */
	ISK("ISK"),

	/**
	 * JMD: Jamaican dollar (Jamaica)
	 */
	JMD("JMD"),

	/**
	 * JOD: Jordanian dinar (Jordan)
	 */
	JOD("JOD"),

	/**
	 * JPY: Japanese yen (Japan)
	 */
	JPY("JPY"),

	/**
	 * KES: Kenyan shilling (Kenya)
	 */
	KES("KES"),

	/**
	 * KGS: Kyrgyzstani som (Kyrgyzstan)
	 */
	KGS("KGS"),

	/**
	 * KHR: Cambodian riel (Cambodia)
	 */
	KHR("KHR"),

	/**
	 * KMF: Comorian franc (Comoros)
	 */
	KMF("KMF"),

	/**
	 * KPW: North Korean won (North Korea)
	 */
	KPW("KPW"),

	/**
	 * KRW: South Korean won (South Korea)
	 */
	KRW("KRW"),

	/**
	 * KWD: Kuwaiti dinar (Kuwait)
	 */
	KWD("KWD"),

	/**
	 * KYD: Cayman Islands dollar (Cayman Islands)
	 */
	KYD("KYD"),

	/**
	 * KZT: Kazakhstani tenge (Kazakhstan)
	 */
	KZT("KZT"),

	/**
	 * LAK: Lao kip (Laos)
	 */
	LAK("LAK"),

	/**
	 * LBP: Lebanese pound (Lebanon)
	 */
	LBP("LBP"),

	/**
	 * LKR: Sri Lankan rupee (Sri Lanka)
	 */
	LKR("LKR"),

	/**
	 * LRD: Liberian dollar (Liberia)
	 */
	LRD("LRD"),

	/**
	 * LSL: Lesotho loti (Lesotho)
	 */
	LSL("LSL"),

	/**
	 * LYD: Libyan dinar (Libya)
	 */
	LYD("LYD"),

	/**
	 * MAD: Moroccan dirham (Morocco)
	 */
	MAD("MAD"),

	/**
	 * MDL: Moldovan leu (Moldova)
	 */
	MDL("MDL"),

	/**
	 * MGA: Malagasy ariary (Madagascar)
	 */
	MGA("MGA"),

	/**
	 * MKD: Macedonian denar (North Macedonia)
	 */
	MKD("MKD"),

	/**
	 * MMK: Myanmar kyat (Myanmar)
	 */
	MMK("MMK"),

	/**
	 * MNT: Mongolian tugrik (Mongolia)
	 */
	MNT("MNT"),

	/**
	 * MOP: Macanese pataca (Macao)
	 */
	MOP("MOP"),

	/**
	 * MRU: Mauritanian ouguiya (Mauritania)
	 */
	MRU("MRU"),

	/**
	 * MUR: Mauritian rupee (Mauritius)
	 */
	MUR("MUR"),

	/**
	 * MVR: Maldivian rufiyaa (Maldives)
	 */
	MVR("MVR"),

	/**
	 * MWK: Malawian kwacha (Malawi)
	 */
	MWK("MWK"),

	/**
	 * MXN: Mexican peso (Mexico)
	 */
	MXN("MXN"),

	/**
	 * MXV: Mexican Unidad de Inversion, an inflation-indexed funds code used in Mexico
	 */
	MXV("MXV"),

	/**
	 * MYR: Malaysian ringgit (Malaysia)
	 */
	MYR("MYR"),

	/**
	 * MZN: Mozambican metical (Mozambique)
	 */
	MZN("MZN"),

	/**
	 * NAD: Namibian dollar (Namibia)
	 */
	NAD("NAD"),

	/**
	 * NGN: Nigerian naira (Nigeria)
	 */
	NGN("NGN"),

	/**
	 * NIO: Nicaraguan cordoba (Nicaragua)
	 */
	NIO("NIO"),

	/**
	 * NOK: Norwegian krone (Norway)
	 */
	NOK("NOK"),

	/**
	 * NPR: Nepalese rupee (Nepal)
	 */
	NPR("NPR"),

	/**
	 * NZD: New Zealand dollar (New Zealand)
	 */
	NZD("NZD"),

	/**
	 * OMR: Omani rial (Oman)
	 */
	OMR("OMR"),

	/**
	 * PAB: Panamanian balboa (Panama)
	 */
	PAB("PAB"),

	/**
	 * PEN: Peruvian sol (Peru)
	 */
	PEN("PEN"),

	/**
	 * PGK: Papua New Guinean kina (Papua New Guinea)
	 */
	PGK("PGK"),

	/**
	 * PHP: Philippine peso (Philippines)
	 */
	PHP("PHP"),

	/**
	 * PKR: Pakistani rupee (Pakistan)
	 */
	PKR("PKR"),

	/**
	 * PLN: Polish zloty (Poland)
	 */
	PLN("PLN"),

	/**
	 * PYG: Paraguayan guarani (Paraguay)
	 */
	PYG("PYG"),

	/**
	 * QAR: Qatari riyal (Qatar)
	 */
	QAR("QAR"),

	/**
	 * RON: Romanian leu (Romania)
	 */
	RON("RON"),

	/**
	 * RSD: Serbian dinar (Serbia)
	 */
	RSD("RSD"),

	/**
	 * RUB: Russian ruble (Russia)
	 */
	RUB("RUB"),

	/**
	 * RWF: Rwandan franc (Rwanda)
	 */
	RWF("RWF"),

	/**
	 * SAR: Saudi riyal (Saudi Arabia)
	 */
	SAR("SAR"),

	/**
	 * SBD: Solomon Islands dollar (Solomon Islands)
	 */
	SBD("SBD"),

	/**
	 * SCR: Seychellois rupee (Seychelles)
	 */
	SCR("SCR"),

	/**
	 * SDG: Sudanese pound (Sudan)
	 */
	SDG("SDG"),

	/**
	 * SEK: Swedish krona (Sweden)
	 */
	SEK("SEK"),

	/**
	 * SGD: Singapore dollar (Singapore)
	 */
	SGD("SGD"),

	/**
	 * SHP: Saint Helena pound (Saint Helena, Ascension and Tristan da Cunha)
	 */
	SHP("SHP"),

	/**
	 * SLE: Sierra Leonean leone (Sierra Leone)
	 */
	SLE("SLE"),

	/**
	 * SLL: Sierra Leonean leone, the old code replaced by SLE after the 2022 redenomination
	 */
	SLL("SLL"),

	/**
	 * SOS: Somali shilling (Somalia)
	 */
	SOS("SOS"),

	/**
	 * SRD: Surinamese dollar (Suriname)
	 */
	SRD("SRD"),

	/**
	 * SSP: South Sudanese pound (South Sudan)
	 */
	SSP("SSP"),

	/**
	 * STN: Sao Tome and Principe dobra (Sao Tome and Principe)
	 */
	STN("STN"),

	/**
	 * SVC: Salvadoran colon (El Salvador)
	 */
	SVC("SVC"),

	/**
	 * SYP: Syrian pound (Syria)
	 */
	SYP("SYP"),

	/**
	 * SZL: Swazi lilangeni (Eswatini)
	 */
	SZL("SZL"),

	/**
	 * THB: Thai baht (Thailand)
	 */
	THB("THB"),

	/**
	 * TJS: Tajikistani somoni (Tajikistan)
	 */
	TJS("TJS"),

	/**
	 * TMT: Turkmenistan manat (Turkmenistan)
	 */
	TMT("TMT"),

	/**
	 * TND: Tunisian dinar (Tunisia)
	 */
	TND("TND"),

	/**
	 * TOP: Tongan pa&#39;anga (Tonga)
	 */
	TOP("TOP"),

	/**
	 * TRY: Turkish lira (Turkey)
	 */
	TRY("TRY"),

	/**
	 * TTD: Trinidad and Tobago dollar (Trinidad and Tobago)
	 */
	TTD("TTD"),

	/**
	 * TWD: New Taiwan dollar (Taiwan)
	 */
	TWD("TWD"),

	/**
	 * TZS: Tanzanian shilling (Tanzania)
	 */
	TZS("TZS"),

	/**
	 * UAH: Ukrainian hryvnia (Ukraine)
	 */
	UAH("UAH"),

	/**
	 * UGX: Ugandan shilling (Uganda)
	 */
	UGX("UGX"),

	/**
	 * USD: United States dollar (United States)
	 */
	USD("USD"),

	/**
	 * USN: United States dollar (next day), a funds code used for settlement in the United States
	 */
	USN("USN"),

	/**
	 * UYI: Uruguay Peso en Unidades Indexadas, an inflation-indexed funds code used in Uruguay
	 */
	UYI("UYI"),

	/**
	 * UYU: Uruguayan peso (Uruguay)
	 */
	UYU("UYU"),

	/**
	 * UYW: Unidad Previsional, a wage-indexed funds code used in Uruguay
	 */
	UYW("UYW"),

	/**
	 * UZS: Uzbekistani sum (Uzbekistan)
	 */
	UZS("UZS"),

	/**
	 * VED: Venezuelan bolivar digital (Venezuela)
	 */
	VED("VED"),

	/**
	 * VES: Venezuelan bolivar soberano (Venezuela)
	 */
	VES("VES"),

	/**
	 * VND: Vietnamese dong (Vietnam)
	 */
	VND("VND"),

	/**
	 * VUV: Vanuatu vatu (Vanuatu)
	 */
	VUV("VUV"),

	/**
	 * WST: Samoan tala (Samoa)
	 */
	WST("WST"),

	/**
	 * XAF: Central African CFA franc (the CEMAC member states)
	 */
	XAF("XAF"),

	/**
	 * XAG: One troy ounce of silver, a metal code
	 */
	XAG("XAG"),

	/**
	 * XAU: One troy ounce of gold, a metal code
	 */
	XAU("XAU"),

	/**
	 * XBA: European Composite Unit (EURCO), a bond market unit
	 */
	XBA("XBA"),

	/**
	 * XBB: European Monetary Unit (E.M.U.-6), a bond market unit
	 */
	XBB("XBB"),

	/**
	 * XBC: European Unit of Account 9 (E.U.A.-9), a bond market unit
	 */
	XBC("XBC"),

	/**
	 * XBD: European Unit of Account 17 (E.U.A.-17), a bond market unit
	 */
	XBD("XBD"),

	/**
	 * XCD: East Caribbean dollar (the Organisation of Eastern Caribbean States)
	 */
	XCD("XCD"),

	/**
	 * XDR: Special drawing rights of the International Monetary Fund
	 */
	XDR("XDR"),

	/**
	 * XOF: West African CFA franc (the UEMOA member states)
	 */
	XOF("XOF"),

	/**
	 * XPD: One troy ounce of palladium, a metal code
	 */
	XPD("XPD"),

	/**
	 * XPF: CFP franc (French Polynesia, New Caledonia, Wallis and Futuna)
	 */
	XPF("XPF"),

	/**
	 * XPT: One troy ounce of platinum, a metal code
	 */
	XPT("XPT"),

	/**
	 * XSU: Sucre, the unit of account of the ALBA member states
	 */
	XSU("XSU"),

	/**
	 * XTS: Code reserved for testing purposes
	 */
	XTS("XTS"),

	/**
	 * XUA: ADB unit of account of the African Development Bank
	 */
	XUA("XUA"),

	/**
	 * XXX: Code for a transaction where no currency is involved
	 */
	XXX("XXX"),

	/**
	 * YER: Yemeni rial (Yemen)
	 */
	YER("YER"),

	/**
	 * ZAR: South African rand (South Africa)
	 */
	ZAR("ZAR"),

	/**
	 * ZMW: Zambian kwacha (Zambia)
	 */
	ZMW("ZMW"),

	/**
	 * ZWL: Zimbabwean dollar (Zimbabwe)
	 */
	ZWL("ZWL");

	private String value;

	ECurrencyCode(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	@JsonCreator
	public static ECurrencyCode fromValue(String value) {
		for (ECurrencyCode b : ECurrencyCode.values()) {
			if (b.value.equals(value)) {
				return b;
			}
		}
		throw new IllegalArgumentException("Unexpected value '" + value + "'");
	}
}
