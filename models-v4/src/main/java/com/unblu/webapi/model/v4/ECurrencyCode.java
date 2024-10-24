
package com.unblu.webapi.model.v4;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * List of &lt;a href&#x3D;\&quot;https://en.wikipedia.org/wiki/ISO_4217\&quot;&gt;ISO 4217&lt;/a&gt; currency codes.
 */
public enum ECurrencyCode {

	/**
	 * AED
	 */
	AED("AED"),

	/**
	 * AFN
	 */
	AFN("AFN"),

	/**
	 * ALL
	 */
	ALL("ALL"),

	/**
	 * AMD
	 */
	AMD("AMD"),

	/**
	 * ANG
	 */
	ANG("ANG"),

	/**
	 * AOA
	 */
	AOA("AOA"),

	/**
	 * ARS
	 */
	ARS("ARS"),

	/**
	 * AUD
	 */
	AUD("AUD"),

	/**
	 * AWG
	 */
	AWG("AWG"),

	/**
	 * AZN
	 */
	AZN("AZN"),

	/**
	 * BAM
	 */
	BAM("BAM"),

	/**
	 * BBD
	 */
	BBD("BBD"),

	/**
	 * BDT
	 */
	BDT("BDT"),

	/**
	 * BGN
	 */
	BGN("BGN"),

	/**
	 * BHD
	 */
	BHD("BHD"),

	/**
	 * BIF
	 */
	BIF("BIF"),

	/**
	 * BMD
	 */
	BMD("BMD"),

	/**
	 * BND
	 */
	BND("BND"),

	/**
	 * BOB
	 */
	BOB("BOB"),

	/**
	 * BOV
	 */
	BOV("BOV"),

	/**
	 * BRL
	 */
	BRL("BRL"),

	/**
	 * BSD
	 */
	BSD("BSD"),

	/**
	 * BTN
	 */
	BTN("BTN"),

	/**
	 * BWP
	 */
	BWP("BWP"),

	/**
	 * BYN
	 */
	BYN("BYN"),

	/**
	 * BZD
	 */
	BZD("BZD"),

	/**
	 * CAD
	 */
	CAD("CAD"),

	/**
	 * CDF
	 */
	CDF("CDF"),

	/**
	 * CHE
	 */
	CHE("CHE"),

	/**
	 * CHF
	 */
	CHF("CHF"),

	/**
	 * CHW
	 */
	CHW("CHW"),

	/**
	 * CLF
	 */
	CLF("CLF"),

	/**
	 * CLP
	 */
	CLP("CLP"),

	/**
	 * CNY
	 */
	CNY("CNY"),

	/**
	 * COP
	 */
	COP("COP"),

	/**
	 * COU
	 */
	COU("COU"),

	/**
	 * CRC
	 */
	CRC("CRC"),

	/**
	 * CUP
	 */
	CUP("CUP"),

	/**
	 * CVE
	 */
	CVE("CVE"),

	/**
	 * CZK
	 */
	CZK("CZK"),

	/**
	 * DJF
	 */
	DJF("DJF"),

	/**
	 * DKK
	 */
	DKK("DKK"),

	/**
	 * DOP
	 */
	DOP("DOP"),

	/**
	 * DZD
	 */
	DZD("DZD"),

	/**
	 * EGP
	 */
	EGP("EGP"),

	/**
	 * ERN
	 */
	ERN("ERN"),

	/**
	 * ETB
	 */
	ETB("ETB"),

	/**
	 * EUR
	 */
	EUR("EUR"),

	/**
	 * FJD
	 */
	FJD("FJD"),

	/**
	 * FKP
	 */
	FKP("FKP"),

	/**
	 * GBP
	 */
	GBP("GBP"),

	/**
	 * GEL
	 */
	GEL("GEL"),

	/**
	 * GHS
	 */
	GHS("GHS"),

	/**
	 * GIP
	 */
	GIP("GIP"),

	/**
	 * GMD
	 */
	GMD("GMD"),

	/**
	 * GNF
	 */
	GNF("GNF"),

	/**
	 * GTQ
	 */
	GTQ("GTQ"),

	/**
	 * GYD
	 */
	GYD("GYD"),

	/**
	 * HKD
	 */
	HKD("HKD"),

	/**
	 * HNL
	 */
	HNL("HNL"),

	/**
	 * HTG
	 */
	HTG("HTG"),

	/**
	 * HUF
	 */
	HUF("HUF"),

	/**
	 * IDR
	 */
	IDR("IDR"),

	/**
	 * ILS
	 */
	ILS("ILS"),

	/**
	 * INR
	 */
	INR("INR"),

	/**
	 * IQD
	 */
	IQD("IQD"),

	/**
	 * IRR
	 */
	IRR("IRR"),

	/**
	 * ISK
	 */
	ISK("ISK"),

	/**
	 * JMD
	 */
	JMD("JMD"),

	/**
	 * JOD
	 */
	JOD("JOD"),

	/**
	 * JPY
	 */
	JPY("JPY"),

	/**
	 * KES
	 */
	KES("KES"),

	/**
	 * KGS
	 */
	KGS("KGS"),

	/**
	 * KHR
	 */
	KHR("KHR"),

	/**
	 * KMF
	 */
	KMF("KMF"),

	/**
	 * KPW
	 */
	KPW("KPW"),

	/**
	 * KRW
	 */
	KRW("KRW"),

	/**
	 * KWD
	 */
	KWD("KWD"),

	/**
	 * KYD
	 */
	KYD("KYD"),

	/**
	 * KZT
	 */
	KZT("KZT"),

	/**
	 * LAK
	 */
	LAK("LAK"),

	/**
	 * LBP
	 */
	LBP("LBP"),

	/**
	 * LKR
	 */
	LKR("LKR"),

	/**
	 * LRD
	 */
	LRD("LRD"),

	/**
	 * LSL
	 */
	LSL("LSL"),

	/**
	 * LYD
	 */
	LYD("LYD"),

	/**
	 * MAD
	 */
	MAD("MAD"),

	/**
	 * MDL
	 */
	MDL("MDL"),

	/**
	 * MGA
	 */
	MGA("MGA"),

	/**
	 * MKD
	 */
	MKD("MKD"),

	/**
	 * MMK
	 */
	MMK("MMK"),

	/**
	 * MNT
	 */
	MNT("MNT"),

	/**
	 * MOP
	 */
	MOP("MOP"),

	/**
	 * MRU
	 */
	MRU("MRU"),

	/**
	 * MUR
	 */
	MUR("MUR"),

	/**
	 * MVR
	 */
	MVR("MVR"),

	/**
	 * MWK
	 */
	MWK("MWK"),

	/**
	 * MXN
	 */
	MXN("MXN"),

	/**
	 * MXV
	 */
	MXV("MXV"),

	/**
	 * MYR
	 */
	MYR("MYR"),

	/**
	 * MZN
	 */
	MZN("MZN"),

	/**
	 * NAD
	 */
	NAD("NAD"),

	/**
	 * NGN
	 */
	NGN("NGN"),

	/**
	 * NIO
	 */
	NIO("NIO"),

	/**
	 * NOK
	 */
	NOK("NOK"),

	/**
	 * NPR
	 */
	NPR("NPR"),

	/**
	 * NZD
	 */
	NZD("NZD"),

	/**
	 * OMR
	 */
	OMR("OMR"),

	/**
	 * PAB
	 */
	PAB("PAB"),

	/**
	 * PEN
	 */
	PEN("PEN"),

	/**
	 * PGK
	 */
	PGK("PGK"),

	/**
	 * PHP
	 */
	PHP("PHP"),

	/**
	 * PKR
	 */
	PKR("PKR"),

	/**
	 * PLN
	 */
	PLN("PLN"),

	/**
	 * PYG
	 */
	PYG("PYG"),

	/**
	 * QAR
	 */
	QAR("QAR"),

	/**
	 * RON
	 */
	RON("RON"),

	/**
	 * RSD
	 */
	RSD("RSD"),

	/**
	 * RUB
	 */
	RUB("RUB"),

	/**
	 * RWF
	 */
	RWF("RWF"),

	/**
	 * SAR
	 */
	SAR("SAR"),

	/**
	 * SBD
	 */
	SBD("SBD"),

	/**
	 * SCR
	 */
	SCR("SCR"),

	/**
	 * SDG
	 */
	SDG("SDG"),

	/**
	 * SEK
	 */
	SEK("SEK"),

	/**
	 * SGD
	 */
	SGD("SGD"),

	/**
	 * SHP
	 */
	SHP("SHP"),

	/**
	 * SLE
	 */
	SLE("SLE"),

	/**
	 * SLL
	 */
	SLL("SLL"),

	/**
	 * SOS
	 */
	SOS("SOS"),

	/**
	 * SRD
	 */
	SRD("SRD"),

	/**
	 * SSP
	 */
	SSP("SSP"),

	/**
	 * STN
	 */
	STN("STN"),

	/**
	 * SVC
	 */
	SVC("SVC"),

	/**
	 * SYP
	 */
	SYP("SYP"),

	/**
	 * SZL
	 */
	SZL("SZL"),

	/**
	 * THB
	 */
	THB("THB"),

	/**
	 * TJS
	 */
	TJS("TJS"),

	/**
	 * TMT
	 */
	TMT("TMT"),

	/**
	 * TND
	 */
	TND("TND"),

	/**
	 * TOP
	 */
	TOP("TOP"),

	/**
	 * TRY
	 */
	TRY("TRY"),

	/**
	 * TTD
	 */
	TTD("TTD"),

	/**
	 * TWD
	 */
	TWD("TWD"),

	/**
	 * TZS
	 */
	TZS("TZS"),

	/**
	 * UAH
	 */
	UAH("UAH"),

	/**
	 * UGX
	 */
	UGX("UGX"),

	/**
	 * USD
	 */
	USD("USD"),

	/**
	 * USN
	 */
	USN("USN"),

	/**
	 * UYI
	 */
	UYI("UYI"),

	/**
	 * UYU
	 */
	UYU("UYU"),

	/**
	 * UYW
	 */
	UYW("UYW"),

	/**
	 * UZS
	 */
	UZS("UZS"),

	/**
	 * VED
	 */
	VED("VED"),

	/**
	 * VES
	 */
	VES("VES"),

	/**
	 * VND
	 */
	VND("VND"),

	/**
	 * VUV
	 */
	VUV("VUV"),

	/**
	 * WST
	 */
	WST("WST"),

	/**
	 * XAF
	 */
	XAF("XAF"),

	/**
	 * XAG
	 */
	XAG("XAG"),

	/**
	 * XAU
	 */
	XAU("XAU"),

	/**
	 * XBA
	 */
	XBA("XBA"),

	/**
	 * XBB
	 */
	XBB("XBB"),

	/**
	 * XBC
	 */
	XBC("XBC"),

	/**
	 * XBD
	 */
	XBD("XBD"),

	/**
	 * XCD
	 */
	XCD("XCD"),

	/**
	 * XDR
	 */
	XDR("XDR"),

	/**
	 * XOF
	 */
	XOF("XOF"),

	/**
	 * XPD
	 */
	XPD("XPD"),

	/**
	 * XPF
	 */
	XPF("XPF"),

	/**
	 * XPT
	 */
	XPT("XPT"),

	/**
	 * XSU
	 */
	XSU("XSU"),

	/**
	 * XTS
	 */
	XTS("XTS"),

	/**
	 * XUA
	 */
	XUA("XUA"),

	/**
	 * XXX
	 */
	XXX("XXX"),

	/**
	 * YER
	 */
	YER("YER"),

	/**
	 * ZAR
	 */
	ZAR("ZAR"),

	/**
	 * ZMW
	 */
	ZMW("ZMW"),

	/**
	 * ZWL
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
