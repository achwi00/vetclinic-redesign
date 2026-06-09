package com.achwi.domain.model;

/**
 * Represents the current status of an {@link com.achwi.domain.model.Appointment}.
 *
 * <ul>
 *     <li>SCHEDULED - the appointment has been created and is awaiting execution.</li>
 *     <li>COMPLETED - the appointment took place and resulted in a Visit record.</li>
 *     <li>CANCELLED - the appointment was canceled by the client or the clinic.</li>
 *     <li>NO_SHOW - the appointment did not take place as the client did not arrive.</li>
 * </ul>
 */

public enum AppointmentStatus {
    SCHEDULED, CANCELLED, COMPLETED, NO_SHOW
}
