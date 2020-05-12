public class Gizmo {
    private String maker;
    private boolean electronic;

    public Gizmo(String maker, boolean electronic) {
        this.maker = maker;
        this.electronic = electronic;
    }

    /**
     * Returns the name of the manufacturer of this Gizmo.
     */
    public String getMaker() {
        return maker;
    }

    /**
     * Returns true if this Gizmo is electronic, and false otherwise.
     */
    public boolean isElectronic() {
        return electronic;
    }

    /**
     * Returns true if this Gizmo is equivalent to the Gizmo
     * object represented by the parameter, and false otherwise.
     */
    public boolean equals(Object other) {
        if (other == this)
            return true;

        if (!(other instanceof Gizmo))
            return false;

        Gizmo o = (Gizmo) other;
        return o.maker == maker && o.electronic == electronic;
    }
}
