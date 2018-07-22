package com.didi.game.domain;

import java.io.Serializable;

public class ParkStruct implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column parkstruct.id
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column parkstruct.name
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table parkstruct
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column parkstruct.id
     *
     * @return the value of parkstruct.id
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column parkstruct.id
     *
     * @param id the value for parkstruct.id
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column parkstruct.name
     *
     * @return the value of parkstruct.name
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column parkstruct.name
     *
     * @param name the value for parkstruct.name
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkstruct
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ParkStruct other = (ParkStruct) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkstruct
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table parkstruct
     *
     * @mbggenerated Thu Jul 19 20:31:05 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}