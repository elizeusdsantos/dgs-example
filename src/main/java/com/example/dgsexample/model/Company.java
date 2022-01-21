package com.example.dgsexample.model;

public class Company {

  private final String companyName;
  private final String domain;
  private final Integer yearFounded;

  private Company(Builder builder) {
    companyName = builder.companyName;
    domain = builder.domain;
    yearFounded = builder.yearFounded;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getDomain() {
    return domain;
  }

  public Integer getYearFounded() {
    return yearFounded;
  }

  public class Builder {

    private String companyName;
    private String domain;
    private Integer yearFounded;

    public Builder companyName(String companyName) {
      this.companyName = companyName;
      return this;
    }

    public Builder domain(String domain) {
      this.domain = domain;

      return this;
    }

    public Builder yearFounded(Integer yearFounded) {
      this.yearFounded = yearFounded;
      return this;
    }

    public Company build() {
      return new Company(this);
    }
  }
}
